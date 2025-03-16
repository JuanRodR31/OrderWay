package com.orderway.Model

import java.util.UUID

data class Address(
    val id: UUID,
    val name: String,
    val address: String,
    val additionalIndications: String
)
