package com.orderway.ui.DeliveryScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.orderway.ui.theme.lightBlue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.orderway.R



@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "My Image Description",
        modifier = Modifier.size(150.dp).
        padding(10.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun AvailableOrder(
    restaurantName: String,
    charge: String,
    distance: String,
    earnings: String,
    onAccept: () -> Unit
) {

    Column(
        modifier = with(Modifier) {
            fillMaxWidth()
                .padding(horizontal = 16.dp , vertical = 4.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = lightBlue)

        }
    ) {
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Column (modifier = Modifier.padding(vertical = 20.dp)){
                Text(
                    text = restaurantName,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
                Text(text = "Cobro: $charge",
                    modifier = Modifier.padding(horizontal = 16.dp))
                Text(text = "Distancia: $distance",
                    modifier = Modifier.padding(horizontal = 16.dp))
                Text(text = "Ganas: $earnings",
                    modifier = Modifier.padding(horizontal = 16.dp))
            }
            MyImage()
        }
        Button(
            onClick = onAccept,
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 40.dp, vertical = 10.dp),
        ) {
            Text(text = "Aceptar")
        }
    }
}

@Preview
@Composable
fun AvailableOrderPreview() {

    AvailableOrder(
        restaurantName = "El Carnal",
        charge = "$40000",
        distance = "5 km",
        earnings = "$4600",
        onAccept = { /* no-op */ }
    )
}