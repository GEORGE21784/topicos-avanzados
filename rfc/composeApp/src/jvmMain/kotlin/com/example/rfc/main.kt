package com.example.rfc

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
   Window(
      onCloseRequest = ::exitApplication,
      title = "Generador RFC",
      resizable = false,
      state = rememberWindowState(
         position = WindowPosition(Alignment.Center),
         width = 500.dp,
         height = 700.dp
      )
   ) {
      App()
   }
}