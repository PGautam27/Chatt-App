package com.example.gchatt_app.composable

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gchatt_app.R
import com.example.gchatt_app.composable.navigation.Screen


@Composable
fun firstScreen(navController: NavController) {
    scrollableColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFDD835)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.istock_513300668_live_chat_1),
            contentDescription = null,
            modifier = Modifier.size(370.dp)
        )
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "G Chat-T",
                style = TextStyle(
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 50.sp,
                    fontStyle = FontStyle.Normal
                )
            )
            Spacer(modifier = Modifier.padding(end = 5.dp))
            Image(
                painter = painterResource(id = R.drawable.icons8_chat_50),
                contentDescription = null,
                Modifier
                    .size(80.dp)
                    .padding(bottom = 0.dp)
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Button(
            onClick = { navController.navigate(Screen.RegisterPage.route) },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFCA231)
            )
        ) {
            Text(
                text = "Lets Get Started",
                style = TextStyle(textAlign = TextAlign.Center, fontSize = 20.sp),
                color = Color(0xFFFFFFFF)
            )
        }
        Spacer(modifier = Modifier.padding(1.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Already have one then",style = TextStyle(textAlign = TextAlign.Center, fontSize = 16.sp))
            TextButton(onClick = { navController.navigate(Screen.Login.route) }) {
                Text(
                    text = "Click here",
                    style = TextStyle(textAlign = TextAlign.Center, fontSize = 16.sp),
                    color = Color(0xFFFB8C00)
                )
            }
        }
    }
}

@Composable
fun scrollableColumn(
    modifier: Modifier = Modifier,
    scrollState: ScrollState = rememberScrollState(0),
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    reverseScrollDirection: Boolean = false,
    isScrollEnabled: Boolean = true,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .verticalScroll(
                scrollState,
                isScrollEnabled,
                reverseScrolling = reverseScrollDirection
            )
            .padding(contentPadding),
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        content = content
    )
}