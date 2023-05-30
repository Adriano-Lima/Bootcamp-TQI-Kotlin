package com.adriano.cred.system.service

import com.adriano.cred.system.model.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer;
    fun findById(id: Long): Customer;
    fun delete(id: Long);
}