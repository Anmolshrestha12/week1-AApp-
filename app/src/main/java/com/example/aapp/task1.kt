package com.example.aapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aapp.ui.theme.Blue01
import com.example.aapp.ui.theme.White01


class task1 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // This is the base (Scaffold)
            Scaffold { innerPadding->
                DesignHeader(innerPadding)
            }
        }
    }

}

@Composable
fun DesignHeader(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .padding(innerPadding)

            .fillMaxSize()
            .background(Blue01),
    ) {


        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.End

        ) {

            Button(onClick = {
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Blue01
                )
            )
            {
                Image(
                    painter = painterResource(R.drawable.superhero),
                    contentDescription = "Profile",

                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(50.dp))
                )
            }

        }
        // SECOND ROW
        Row {
            Column (
                modifier =
                    Modifier.padding(
                        horizontal = 24.dp,
                        vertical = 5.dp))
            {
                Text(text = "Card",
                    style =  TextStyle(
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Simple and easy to use app",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color.White
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
        ) {


            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )


                    ) { Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Image(

                        painter = painterResource(R.drawable.books),

                        contentDescription = null, contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .padding(20.dp)

                    )
                    Text(text = "Text",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(text = "so this is the text",
                        modifier = Modifier.alpha(0.6f),
                        style = TextStyle(
                            fontSize = 10.sp,
                        )
                    )           }
                }



                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            painter = painterResource(R.drawable.gps),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Address",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Address",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(

                            painter = painterResource(R.drawable.boy),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Character",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Character",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(

                            painter = painterResource(R.drawable.card),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Bank Card",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Bank Card",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }

            // 5th Row
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            painter = painterResource(R.drawable.password),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Password",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the password ",
                            Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }}
                Spacer(modifier = Modifier.width(20.dp))


                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            painter = painterResource(R.drawable.distribution),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Logistic",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the logistic ",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row  {
                Card(
                    modifier = Modifier.height(70.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ){
                    Row (
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, top = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            painter = painterResource(R.drawable.cogwheel),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clip(RoundedCornerShape(50.dp))


                        )

                        Column {
                            Text(text = "Setting",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold

                                )
                            )
                            Text(text = "So this is the setting  ",
                                modifier = Modifier.alpha(0.6f),
                                style = TextStyle(
                                    fontSize = 10.sp,)
                            )
                        }

                    }
                }
            }

        }

    }
}


@Preview
@Composable
fun PreviewDesign(){
    DesignHeader(innerPadding = PaddingValues(0.dp))
}