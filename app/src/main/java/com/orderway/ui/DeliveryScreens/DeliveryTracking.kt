package com.orderway.ui.DeliveryScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.orderway.R
import com.orderway.ui.theme.lightBlue

@Composable
fun image() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "My Image Description",
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Tracking(time: String ,
             orderState: String,
             onChangeState: () -> Unit
             ){

    LazyColumn {
        item {
            Spacer(modifier = Modifier.height(50.dp))
        }
        item {
            Text(text = stringResource(id = R.string.estimatedTime),
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item{
            Text(text = time,
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        item {
            image()
        }
        item{
            Button(onClick = onChangeState,
                modifier = Modifier.padding(horizontal = 16.dp)) {
                Text (
                    text = orderState,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp)
                        .fillMaxWidth()
                )
            }
        }
        item {
            Column(
                modifier = with(Modifier) {
                    fillMaxWidth()
                        .padding(horizontal = 16.dp , vertical = 4.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(color = lightBlue)

                }
            ) {
                Text(text = stringResource(id = R.string.summary),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)
                )
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    MyImage()
                    Column (modifier = Modifier.padding(vertical = 20.dp)){
                        Text(text="hola")
                    }
                }
            }
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
fun TrackingPreview(){
    Tracking("10:00AM-10:30AM",
        "Recogi pedido",
        onChangeState = { /* no-op */ })
}