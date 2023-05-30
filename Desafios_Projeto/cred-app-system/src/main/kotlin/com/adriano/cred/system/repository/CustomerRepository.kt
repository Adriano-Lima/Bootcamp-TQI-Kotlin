package com.adriano.cred.system.repository

import com.adriano.cred.system.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository:JpaRepository<Customer,Long> {
}