package com.orderway.ui.DeliveryScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.orderway.Model.Order
import com.orderway.R
@Composable
fun OrderList(orders: List<Order>) {

    LazyColumn {
        item {
            Spacer(modifier = Modifier.height(50.dp))
        }
        item{
            Column{
                Text(text = stringResource(id = R.string.nearOrders),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp))
            }
            Spacer(modifier = Modifier.height(6.dp))
        }
        items(orders) { order ->
            AvailableOrder(
                restaurantName = order.restaurantName,
                charge = order.charge,
                distance = order.distance,
                earnings = order.earnings,
                onAccept = { /* Handle accept action */ }
            )
        }
    }
    Box(
        modifier = Modifier.fillMaxWidth()
            .background(Color.White)
    ) {
        IconButton(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Atrás"
            )
        }
        Text(
            text = stringResource(id = R.string.domiciliary),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun OrderListPreview() {
    OrderList(
        orders = listOf(
            Order("El Carnal", "$40000", "5 km", "$4600"),
            Order("El Carnal", "$40000", "5 km", "$4600"),
            Order("El Carnal", "$40000", "5 km", "$4600"),
            Order("El Carnal", "$40000", "5 km", "$4600"),
            Order("El Carnal", "$40000", "5 km", "$4600"),
            Order("El Carnal", "$40000", "5 km", "$4600"),
            Order("El Carnal", "$40000", "5 km", "$4600"),
        )
    )
}