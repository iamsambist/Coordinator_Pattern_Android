package com.example.logindemoapp.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.logindemoapp.ui.theme.LoginDemoAppTheme

@Composable
fun ScreenLoginView(
    innerPadding: PaddingValues,
    loginButtonAction: (() -> Unit),
    registerButtonAction: (() -> Unit),
    forgetPasswordButtonAction: (() -> Unit)
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Button(
            onClick = { loginButtonAction() }
        ) {
           Text(text = "Login")
        }
        Button(
            onClick = { registerButtonAction()  }
        ) {
            Text(text = "Register")
        }
        Button(
            onClick = {forgetPasswordButtonAction() }
        ) {
            Text(text = "Forget Password")
        }
    }


}

//@Preview
//@Composable
//fun ScreenLoginViewPreview(){
//    LoginDemoAppTheme {
//        ScreenLoginView(
//            innerPadding = PaddingValues()
//        ) {}
//    }
//}

@Preview
@Composable
fun ScreenLoginViewPreview() {
    LoginDemoAppTheme {
        ScreenLoginView(
            innerPadding = PaddingValues(),
            loginButtonAction = {},
            registerButtonAction = {},
            forgetPasswordButtonAction = {}
        )
    }
}