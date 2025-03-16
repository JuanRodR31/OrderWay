package com.orderway.Model

import java.util.UUID

data class Product(
    val id: UUID,
    val name: String,
    val description: String,
    val price: Float,
    val available: Boolean
    )
