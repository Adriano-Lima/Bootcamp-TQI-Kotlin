package com.adriano.cred.system.service

import com.adriano.cred.system.model.Credit
import java.util.UUID

interface ICreditService {
    fun save(credit:Credit):Credit;
    fun findAllByCustomer(custumerId:Long):List<Credit>;
    fun findByCredCode(custumerId: Long, creditCode:UUID):Credit;
}