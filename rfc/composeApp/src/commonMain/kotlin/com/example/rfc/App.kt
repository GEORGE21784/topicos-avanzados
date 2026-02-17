package com.example.rfc

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val HackerPink = Color(0xFFFF4081)
val DarkBackground = Color(0xFF121212)
val SurfaceGrey = Color(0xFF1E1E1E)
val TextWhite = Color(0xFFEEEEEE)
val TextGrey = Color(0xFFB0B0B0)

val DarkPinkScheme = darkColorScheme(
   primary = HackerPink,
   onPrimary = Color.Black,
   background = DarkBackground,
   surface = SurfaceGrey,
   onSurface = TextWhite,
   primaryContainer = Color(0xFF2D1B22),
   onPrimaryContainer = HackerPink
)
@Composable
fun App() {
   MaterialTheme(colorScheme = DarkPinkScheme) {
      Surface(
         modifier = Modifier.fillMaxSize(),
         color = MaterialTheme.colorScheme.background
      ) {
         RfcScreen()
      }
   }
}

@Composable
fun RfcScreen() {
   var name by remember { mutableStateOf("") }
   var fatherName by remember { mutableStateOf("") }
   var motherName by remember { mutableStateOf("") }
   var year by remember { mutableStateOf("") }
   var month by remember { mutableStateOf("") }
   var day by remember { mutableStateOf("") }

   val scrollState = rememberScrollState()

   val ans by remember {
      derivedStateOf {
         val date = if(year.length == 2 && month.length == 2 && day.length == 2) "$year$month$day" else ""
         RfcCalculator.run(name, fatherName, motherName, date)
      }
   }

   Column(
      modifier = Modifier
         .padding(32.dp)
         .fillMaxWidth()
         .verticalScroll(scrollState),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.spacedBy(20.dp)
   ) {

      Text(
         text = "GENERADOR RFC",
         style = MaterialTheme.typography.headlineMedium.copy(
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
         ),
         color = MaterialTheme.colorScheme.primary
      )

      Card(
         colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
         ),
         elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
         shape = RoundedCornerShape(12.dp),
         modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)
      ) {
         Column(
            modifier = Modifier.padding(24.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
         ) {
            Text(
               text = "CLAVE GENERADA",
               style = MaterialTheme.typography.labelMedium,
               color = TextGrey
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
               text = ans,
               style = MaterialTheme.typography.displayMedium.copy(
                  fontWeight = FontWeight.Black,
                  letterSpacing = 4.sp
               ),
               color = if(ans.contains("...")) TextGrey else HackerPink
            )
         }
      }
      
      MyTextField(
         value = fatherName,
         onValueChange = { str -> if(str.all { it.isLetter() || it.isWhitespace() }) fatherName = str},
         label = "Apellido Paterno"
      )
      MyTextField(
         value = motherName,
         onValueChange = { str -> if(str.all { it.isLetter() || it.isWhitespace() }) motherName = str},
         label = "Apellido Materno"
      )
      MyTextField(
         value = name,
         onValueChange = { str -> if(str.all { it.isLetter() || it.isWhitespace() }) name = str},
         label = "Nombre(s)"
      )

      Row(
         modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.spacedBy(12.dp)
      ) {
         Box(modifier = Modifier.weight(1f)) {
            MyTextField(
               value = year,
               onValueChange = { str -> if(str.length <= 2 && str.all { it.isDigit() }) { year = str}
               },
               label = "Año (YY)",
               isNumber = true
            )
         }

         Box(modifier = Modifier.weight(1f)) {
            MyTextField(
               value = month,
               onValueChange = { str -> if(str.length <= 2 && str.all { it.isDigit() }) { month = str} },
               label = "Mes (MM)",
               isNumber = true
            )
         }

         Box(modifier = Modifier.weight(1f)) {
            MyTextField(
               value = day,
               onValueChange = { str -> if(str.length <= 2 && str.all { it.isDigit() }) {day = str } },
               label = "Día (DD)",
               isNumber = true
            )
         }
      }
   }
}

@Composable
fun MyTextField(
   value: String,
   onValueChange: (String) -> Unit,
   label: String,
   isNumber: Boolean = false
) {
   OutlinedTextField(
      value = value,
      onValueChange = { onValueChange(it.uppercase())},
      label = { Text(label) },
      modifier = Modifier.fillMaxWidth(),
      singleLine = true,
      shape = RoundedCornerShape(12.dp),
      colors = OutlinedTextFieldDefaults.colors(
         focusedBorderColor = HackerPink,
         unfocusedBorderColor = Color.DarkGray,
         focusedLabelColor = HackerPink,
         unfocusedLabelColor = TextGrey,
         cursorColor = HackerPink,
         focusedTextColor = TextWhite,
         unfocusedTextColor = TextWhite
      ),
      keyboardOptions = KeyboardOptions(
         capitalization = KeyboardCapitalization.Characters,
         keyboardType = if(isNumber) KeyboardType.Number else KeyboardType.Text
      )
   )
}