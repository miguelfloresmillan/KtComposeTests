package com.mgl.ktcomposetests.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mgl.ktcomposetests.R
import com.mgl.ktcomposetests.ui.components.HeaderTextComponent
import com.mgl.ktcomposetests.ui.components.MyPasswordTextField
import com.mgl.ktcomposetests.ui.components.MyTextField
import com.mgl.ktcomposetests.ui.components.NormalTextComponent

@Composable
fun LoginView() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeaderTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(10.dp))
            MyTextField(
                labelValue = "First Name",
                painterResource(id = R.drawable.baseline_account_circle_24)
            )
            MyTextField(
                labelValue = "Last Name",
                painterResource = painterResource(id = R.drawable.baseline_account_circle_24)
            )
            MyTextField(
                labelValue = "Email",
                painterResource = painterResource(id = R.drawable.baseline_account_circle_24)
            )
            MyPasswordTextField(
                labelValue = "Password",
                painterResource = painterResource(id = R.drawable.baseline_account_circle_24)
            )
        }

    }
}

@Preview
@Composable
fun viewPreview() {
    LoginView()
}
