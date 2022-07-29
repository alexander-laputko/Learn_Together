package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticlePage(
                        title = stringResource(id = R.string.title),
                        text1 = stringResource(id = R.string.text_1),
                        text2 = stringResource(id = R.string.text_2)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticlePage(title: String, text1: String, text2: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column {
        Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxWidth())
        Text(text = title)
        Text(text = text1)
        Text(text = text2)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        ArticlePage(
            title = stringResource(id = R.string.title),
            text1 = stringResource(id = R.string.text_1),
            text2 = stringResource(id = R.string.text_2)
        )
    }
}