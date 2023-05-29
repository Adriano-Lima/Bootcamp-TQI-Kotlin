package com.adriano.cred.system.exception

data class BusinessException(override val message: String?):RuntimeException(message)
