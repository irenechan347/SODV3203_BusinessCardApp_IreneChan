package com.example.sodv3203_businesscardapp_irenechan

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sodv3203_businesscardapp_irenechan.ui.theme.SODV3203_BusinessCardApp_IreneChanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SODV3203_BusinessCardApp_IreneChanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.background(Color(0xFFDAFFFB))
    ) {
        Box(
            modifier = modifier
        )
        Info(
            modifier = modifier
        )
        Contact(
            modifier = modifier
        )
    }
}

@Composable
private fun Info(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Image(
            painter = painterResource(id = R.drawable.img_char_2),
            contentDescription = null,
            modifier = modifier.size(150.dp)
        )
        Text(
            text = stringResource(R.string.irene_chan),
            fontSize = 50.sp,
            color = Color(0xFF04364A)
        )
        Spacer(modifier = modifier.padding(10.dp))
        Text(
            text = stringResource(R.string.software_development_student_bvc),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color(0xFF176B87)
        )
    }
}

@Composable
private fun Contact(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_cannedcatfood),
                contentDescription = null,
                modifier = modifier
                    .size(30.dp)
            )
            Spacer(modifier = modifier.padding(8.dp))
            Text(
                text = stringResource(R.string._1_587_111_2222),
                fontSize = 16.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_cannedcatfood),
                contentDescription = null,
                modifier = modifier.size(30.dp)
            )
            Spacer(modifier = modifier.padding(8.dp))
            Text(
                text = stringResource(R.string.bowvalleycollege),
                fontSize = 16.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.padding(bottom = 50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_cannedcatfood),
                contentDescription = null,
                modifier = modifier.size(30.dp)
            )
            Spacer(modifier = modifier.padding(8.dp))
            Text(
                text = stringResource(R.string.i_chan347_mybvc_ca),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SODV3203_BusinessCardApp_IreneChanTheme {
        BusinessCard()
    }
}