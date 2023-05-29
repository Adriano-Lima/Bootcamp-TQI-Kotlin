package com.adriano.cred.system.service.impl

import com.adriano.cred.system.exception.BusinessException
import com.adriano.cred.system.model.Customer
import com.adriano.cred.system.repository.CustomerRepository
import com.adriano.cred.system.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustumerService( val customerRepository: CustomerRepository ) : ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer);

    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id).orElseThrow {
            throw BusinessException("Id $id not found")
        }

    override fun delete(idCustomer: Long) {
        val customer = this.findById(idCustomer)
        this.customerRepository.delete(customer)
    }

}