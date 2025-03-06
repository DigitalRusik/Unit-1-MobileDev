package com.example.businesscard

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCon(
                        name = "Русик",
                        title = "Экстраординарный андроид девелопер",
                        phone = "8(800) 555-35-35",
                        email = "rusevich@mail.ru",
                        link = "@digitalruski",
                        modifier = Modifier.background(color = Color(0xFFbfe8bf)))
                }
            }
        }
    }
}

@Composable
fun BusinessCon(name: String, title: String, phone: String, email: String, link: String, modifier: Modifier = Modifier.background(color = Color(0xFFbfe8bf))) {
    val image = painterResource(R.drawable.adnroid)
    val Pimage = painterResource(R.drawable.phone)
    val Simage = painterResource(R.drawable.share)
    val Eimage = painterResource(R.drawable.mail)
    val fontsize = 16
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier = modifier.align(Alignment.Center)) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.height(96.dp)
                    .fillMaxSize()
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = name,
                fontSize = 32.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF307e30),
                modifier = Modifier.padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column(modifier = modifier.align(Alignment.BottomCenter).padding(vertical = 64.dp)) {
            Row(modifier = modifier) {
                Image(
                    painter = Pimage,
                    contentDescription = null,
                    modifier = Modifier.height(16.dp)
                        .align(Alignment.CenterVertically)

                )
                Text(
                    text = phone,
                    fontSize = fontsize.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Row(modifier = Modifier) {
                Image(
                    painter = Simage,
                    contentDescription = null,
                    modifier = Modifier.height(16.dp)
                        .align(Alignment.CenterVertically)
                )
                Text(
                    text = link,
                    fontSize = fontsize.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )

            }
            Row {
                Image(
                    painter = Eimage,
                    contentDescription = null,
                    modifier = Modifier.height(16.dp)
                        .align(Alignment.CenterVertically)

                )
                Text(
                    text = email,
                    fontSize = fontsize.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCon(name = "Русик",
            title = "Экстраординарный андроид девелопер",
            phone = "8(800) 555-35-35",
            email = "rusevich@mail.ru",
            link = "@digitalruski")
    }
}