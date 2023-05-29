package com.adriano.cred.system.dto

import com.adriano.cred.system.model.Credit
import com.adriano.cred.system.model.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Invalid input") val creditValue: BigDecimal,
    @field:Future val dayFirstInstallment: LocalDate,
    @field:Min(value = 1) @field:Max(value = 10) val numberOffInstallments: Int,
    @field:NotEmpty(message = "Invalid input") val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOffInstallments = this.numberOffInstallments,
        customer = Customer(id = this.customerId)
    )
}
