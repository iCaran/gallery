package com.example.testcompose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.ui.theme.TestComposeTheme
//import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {
                /*Text(text="karan")
                Text(text="shaw")*/
                /*Row(modifier= Modifier
                    .fillMaxSize() // full screen
                    .background(androidx.compose.ui.graphics.Color.Magenta),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) */
                /*Column(modifier= Modifier
                    .fillMaxSize() // full screen
                    .background(androidx.compose.ui.graphics.Color.Magenta),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text(text="karan")
                    Text(text="shaw")
                }*/
                /*Column(
                    modifier= Modifier
                        .background(androidx.compose.ui.graphics.Color.Green)
                        //.width(600.dp)
                        //.requiredWidth(600.dp)
                        //.fillMaxWidth(0.5f)
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .border(4.dp, androidx.compose.ui.graphics.Color.Magenta)
                        .padding(5.dp)
                        .border(4.dp, androidx.compose.ui.graphics.Color.Blue)
                        .padding(5.dp)
                        .border(4.dp, androidx.compose.ui.graphics.Color.Red)
                        .padding(5.dp)

                ) {
                    Text(text = "Hello", modifier = Modifier.clickable {

                    })
                    Spacer(modifier = Modifier.height(100.dp))
                    Text(text = "World", modifier = Modifier.clickable {

                    })
                }*/
                val painter= painterResource(id = R.drawable.erdg)
                val description="pic"
                val title="hazy scooter"
                Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)
                ){
                    ImageCard(painter = painter, contentDescription = description, title = title)
                }
            }
        }
    }
}
@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier=Modifier
){
    Card(
        modifier= Modifier.fillMaxWidth(),
        shape= RoundedCornerShape(15.dp),
        elevation = 5.dp,
    ){
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                androidx.compose.ui.graphics.Color.Transparent,
                                androidx.compose.ui.graphics.Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    title,
                    style = TextStyle(
                        color = androidx.compose.ui.graphics.Color.White,
                        fontSize = 10.sp
                    )
                )
            }
        }
    }
}