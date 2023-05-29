package com.adriano.cred.system.service.impl

import com.adriano.cred.system.model.Credit
import com.adriano.cred.system.repository.CreditRepository
import com.adriano.cred.system.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreditService(val creditRepository: CreditRepository, val custumerService: CustumerService) : ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = credit.customer?.id?.let { id -> custumerService.findById(id) }
        }
        return creditRepository.save(credit);
    }

    override fun findAllByCustomer(custumerId: Long): List<Credit> = this.creditRepository.findAllByCustomerId(custumerId)

    override fun findByCredCode(custumerId: Long, creditCode: UUID): Credit {
        val credit: Credit = this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("Creditcode $creditCode not found")
        return if (credit.customer?.id == custumerId) credit else throw RuntimeException("Contact admin")
    }
}