package com.example.businesscardassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardassignment.ui.theme.BusinessCardAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard("Jennifer Doe", "Android Developer Extraordinaire", "+11 (123) 444 555 666", "@AndroidDev", "jen.doe@android.com")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(fullname: String, title: String, phoneNumber: String, username: String, email: String)
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFd2e8d5)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.android_logo), contentDescription = null,
            modifier = Modifier.height(120.dp).width(120.dp).background(Color(0xFF073042)))
        Text(
            text = fullname,
            modifier = Modifier.padding(bottom = 4.dp),
            fontWeight = FontWeight.Light,
            fontSize = 48.sp
        )
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF016d39)
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp, start = 80.dp),
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(top = 14.dp),
        ){
            Icon(
                Icons.Rounded.Phone, contentDescription = null,
                modifier = Modifier,
                Color(0xFF016d39)
            )
            Text(text = phoneNumber, modifier = Modifier.padding(start = 18.dp),color = Color.Black)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(top = 14.dp),
        ){
            Icon(Icons.Rounded.Share, contentDescription = null, modifier = Modifier, Color(0xFF016d39))
            Text(text = username, modifier = Modifier.padding(start = 18.dp),color = Color.Black)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(top = 14.dp),
        ){
            Icon(Icons.Rounded.Email, contentDescription = null, modifier = Modifier, Color(0xFF016d39))
            Text(text = email, modifier = Modifier.padding(start = 18.dp),color = Color.Black)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAssignmentTheme {
        BusinessCard("Jennifer Doe", "Android Developer Extraordinaire", "+11 (123) 444 555 666", "@AndroidDev", "jen.doe@android.com")
    }
}