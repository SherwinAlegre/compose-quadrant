package com.example.composequadrant_lm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant_lm.ui.theme.ComposeQuadrantLMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantLMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Quadrant(
    firstTit: String,
    firstTex: String,
    secondTit: String,
    secondTex: String,
    thiRdTit: String,
    thirdTex: String,
    fourthTit: String,
    fourthTex: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(.5f)
                .fillMaxWidth()
        ) {
            Box(modifier = Modifier
                .background(Color.Green)
                .weight(.5f)) {
            Column(modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp)
                .wrapContentHeight(Alignment.CenterVertically)
                .background(Color.Green)) {
                Text(
                    text = firstTit,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
                Text(
                    text = firstTex,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
            }
            }
            Box(modifier = Modifier
                .background(Color.Yellow)
                .weight(.5f))
            {
            Column(modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp)
                .wrapContentHeight(Alignment.CenterVertically)) {
                Text(
                    text = secondTit,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
                Text(
                    text = secondTex,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
            }
        }}
        Row(
            modifier = Modifier
                .fillMaxHeight(1f)
                .wrapContentHeight(Alignment.CenterVertically)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        ) {
            Box(modifier = Modifier
                .background(Color.Cyan)
                .weight(.5f)){
            Column(modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp)
                .wrapContentHeight(Alignment.CenterVertically)) {
                Text(
                    text = thiRdTit,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
                Text(
                    text = thirdTex,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)

                )
            }}
            Box(modifier = Modifier
                .background(Color.LightGray)
                .weight(.5f)) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(16.dp)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = fourthTit,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 25.dp)
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = fourthTex,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantLMTheme {
        Quadrant(
            firstTit = stringResource(id = R.string.first_title_text),
            firstTex = stringResource(id = R.string.first_text),
            secondTit = stringResource(id = R.string.second_title_text),
            secondTex = stringResource(id = R.string.second_text),
            thiRdTit = stringResource(id = R.string.third_title_text),
            thirdTex = stringResource(id = R.string.third_text),
            fourthTit = stringResource(id = R.string.fourth_title_text),
            fourthTex = stringResource(id = R.string.fourth_text)
        )
    }
}