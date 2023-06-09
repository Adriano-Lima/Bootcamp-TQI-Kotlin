package com.adriano.cred.system.dto

import com.adriano.cred.system.model.Customer
import java.math.BigDecimal

data class CustomerView(
    val firstname: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val zipCode: String,
    val street: String
) {
    constructor(customer: Customer):this (
        firstname = customer.firstName,
        lastName = customer.lastName,
        cpf = customer.cpf,
        income = customer.income,
        email = customer.cpf,
        zipCode = customer.address.zipCode,
        street = customer.address.street
    )

}
