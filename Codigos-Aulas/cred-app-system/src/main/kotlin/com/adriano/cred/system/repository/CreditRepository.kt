package com.adriano.cred.system.repository

import com.adriano.cred.system.model.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CreditRepository:JpaRepository<Credit,Long> {
    fun findByCreditCode(creditCode : UUID) : Credit?

    @Query(value = "select *from CREDIt where CUSTOMER_ID = ?1", nativeQuery = true)
    fun findAllByCustomerId(customerId : Long): List<Credit>
}