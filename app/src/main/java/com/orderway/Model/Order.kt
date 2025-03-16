package com.orderway.Model

import java.util.UUID

data class Order(
    val orderId: UUID,
    val restaurant: Restaurant,
    val products: List<Product>,
    val shippingCost: Float,
    val totalCharge: Float,
    val distance: String,
    val tips: Float,
    val domiciliaryEarnings: Float,
    val orderAddress: Address,
    val paymentMethod: PaymentMethod
)