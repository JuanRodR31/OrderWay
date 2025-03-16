package com.orderway.Model

data class User(
    val phoneNumber: Int,
    val names: String,
    val lastNames: String,
    val mail: String,
    val password: String,
    val documentNumber: Int,
    val domiciliaryAvailable: Boolean,
    val userOrders: List<Order>,
    val domiciliaryOrders: List<Order>,
    val userRestaurants: List<Restaurant>,
    val userAddresses: List<Address>,
    val paymentMethods: List<PaymentMethod>
)