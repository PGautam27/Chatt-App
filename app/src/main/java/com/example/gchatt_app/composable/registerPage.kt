package com.example.gchatt_app.composable

import android.graphics.Outline
import android.graphics.drawable.Icon
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gchatt_app.R
import com.example.gchatt_app.composable.navigation.Screen


@Composable
fun registerPage(navController: NavController) {
    var name = remember{ mutableStateOf("")}
    var phone = remember { mutableStateOf("")}
    var email = remember { mutableStateOf("")}
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(0xFFFDD835))
            .fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 150.dp)
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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .background(color = Color(0xFFFCA231))
        ) {
            Text(text = "Register", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold,fontFamily = FontFamily.Cursive), modifier = Modifier.padding(bottom = 4.dp))
        }
        Spacer(modifier = Modifier.padding(10.dp))
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            placeholder = { Text(text = "ALEX", style = TextStyle(fontSize = 16.sp))},
            label = { Text(text = "NAME", style = TextStyle(fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, fontSize = 20.sp))},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFFCA231),
                unfocusedBorderColor = Color(0xFFFCA231),
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color(0xFFFCA231),
                textColor = Color.Black
            ),
            textStyle = TextStyle(fontSize = 16.sp),
            singleLine = true,
        )
        Spacer(modifier = Modifier.padding(5.dp))
        OutlinedTextField(
            value = phone.value,
            placeholder = { Text(text = "+91XXXXXXXXXX", style = TextStyle(fontSize = 16.sp))},
            onValueChange = { phone.value = it },
            label = { Text(text = "MOBILE NO.", style = TextStyle(fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, fontSize = 20.sp))},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFFCA231),
                unfocusedBorderColor = Color(0xFFFCA231),
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color(0xFFFCA231),
                textColor = Color.Black,
                leadingIconColor = Color.Black
            ),
            textStyle = TextStyle( fontSize = 16.sp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            )
        )
        Spacer(modifier = Modifier.padding(5.dp))
        OutlinedTextField(
            value = email.value,
            placeholder = { Text(text = "xyz@gmail.com" , style = TextStyle(fontSize = 16.sp))},
            onValueChange = { email.value = it },
            label = { Text(text = "EMAIL ID", style = TextStyle(fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, fontSize = 20.sp))},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFFCA231),
                unfocusedBorderColor = Color(0xFFFCA231),
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color(0xFFFCA231),
                textColor = Color.Black,
                leadingIconColor = Color.Black
            ),
            textStyle = TextStyle(fontSize = 16.sp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )
        Spacer(modifier = Modifier.padding(15.dp))
        Button(
            onClick = { navController.navigate(Screen.Login.route) },
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .background(Color(0xFFFDD835))
                .clip(RoundedCornerShape(20.dp)),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFFCA231)
            )
        ) {
            Text(text = "SUBMIT", style = TextStyle(color = Color.Black, fontFamily = FontFamily.Cursive, fontSize = 25.sp, fontWeight = FontWeight.Bold))
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Already have one then",style = TextStyle(textAlign = TextAlign.Center, fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive))
            TextButton(onClick = { navController.navigate(Screen.Login.route) }) {
                Text(
                    text = "Click here",
                    style = TextStyle(textAlign = TextAlign.Center, fontSize = 20.sp, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold),
                    color = Color(0xFFFB8C00)
                )
            }
        }
    }
}

