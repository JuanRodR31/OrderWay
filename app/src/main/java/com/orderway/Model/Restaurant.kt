package com.orderway.Model

import java.util.UUID

data class Restaurant(
    val id: UUID,
    val name: String,
    val available: Boolean,
    val location: String,
    val products: List<Product>
)
