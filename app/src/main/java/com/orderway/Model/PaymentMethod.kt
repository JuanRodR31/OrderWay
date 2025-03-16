package com.orderway.Model

import java.util.Date

data class PaymentMethod(
    val methodType: String,
    val cardNumber: Int,
    val expirationDate: String,
    val CVV: Int
)
