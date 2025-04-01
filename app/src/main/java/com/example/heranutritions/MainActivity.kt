package com.example.heranutritions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var time_of_the_day by remember {
                mutableStateOf("") //State variables to store user input in this case time of the day
            }

            var food_name by remember {
                mutableStateOf("") //State variables to store user input in this case food name

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally, //center items horizontally to align
                modifier = Modifier
                    .fillMaxSize() // utilises the full screen
                    .background(Color(0xff212121)) // background color dark gray


            ) {
                Text(
                    text = "Hera Nutritions", //title of the application in bold
                    fontSize = 30.sp, // size of font for title of the application
                    fontWeight = FontWeight.Bold, //weight of the title font
                    color = Color.LightGray, //color of the title
                    textAlign = TextAlign.Center, // alignment of the title centered
                )
                Spacer(modifier = Modifier.height(16.dp)) // spacing between the title and instructions

                Text(text = "When searching utilise the time of the day please see below:",
                    fontSize = 24.sp, //font size
                    fontWeight = FontWeight.Medium, //font weight
                    color = Color.LightGray, // font color
                    textAlign = TextAlign.Center, // center alignment of instructions
                ) // font size, weight, color, alignment

                Spacer(modifier = Modifier.height(16.dp)) // spacing using height

                Text(text = "Morning", //time of the day Morning
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) // font size, weight, color, alignment

                Text(text = "Mid-morning", //time of the day Mid-morning
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) // font size, weight, color, alignment

                Text(text = "Afternoon", //time of the day Afternoon
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) // font size, weight, color, alignment

                Text(text = "Mid-afternoon", //time of the day Mid-afternoon
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) // font size, weight, color, alignment

                Text(text = "Dinner", //time of the day Dinner
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) // font size, weight, color, alignment

                Text(text = "Dessert", //time of the day Dessert
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) // font size, weight, color, alignment

                Spacer(modifier = Modifier.height(16.dp)) // spacing using height

                OutlinedTextField(value = time_of_the_day, onValueChange = { text ->

                    time_of_the_day = text

                }, // search text box

                    placeholder = {
                        Text(text = "Enter your meal of the day here",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.LightGray,
                            textAlign = TextAlign.Center,
                        ) // text inside text box with the font size, weight, color, alignment
                    },
                    textStyle = LocalTextStyle.current.copy(color = Color.White), // White text inside the box
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.DarkGray, // Dark background for contrast
                        unfocusedContainerColor = Color.Gray,
                        focusedIndicatorColor = Color.White, // White underline when active
                        unfocusedIndicatorColor = Color.LightGray,
                        cursorColor = Color.White, // White cursor
                        focusedTextColor = Color.White // Ensures text stays white
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))//spacing using height

                // Row Layout to Arrange Buttons Side by Side
                Row {

                    //Button functions on Search = results

                    Button(onClick = {
                        food_name = when (time_of_the_day) {
                            "Morning" -> "Cereal and Yoghurt OR Eggs, Bacon and Bread OR Croissant with Ham and Cheese"
                            "Mid-morning" -> "Smoothie OR Yoghurt OR Energy Bar"
                            "Afternoon" -> "Sandwich OR Pasta OR Burger and fries"
                            "Mid-afternoon" -> "Chips OR Protein Bar OR Sweets"
                            "Dinner" -> "Spaghetti Meatballs OR Pizza OR Steak with Salad and Mash Potatoes"
                            "Dessert" -> "Apple or Milk Tart OR Ice-cream OR Malva Pudding"
                            else -> "Invalid time of the day"

                        } // Search by time of the day to get food name as the result

                    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray), // color of the button
                        shape = RoundedCornerShape(20.dp), // shape of the button
                        border = BorderStroke(2.dp, Color.White), //  White border/Stroke
                        modifier = Modifier
                            .width(180.dp) ///width of the button
                            .padding(horizontal = 18.dp) //added padding space in dp horizontally to button
                            .height(50.dp)) // height of the button

                    // Row Layout to Arrange Buttons Side by Side
                    {
                        Text(text = "Search",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                        ) //font size, weight, color, alignment
                    }
                    Spacer(modifier = Modifier.width(30.dp)) //spacing using width

                    //Button functions on Search = results and then clears

                    Button(onClick = {
                        time_of_the_day = ""
                        food_name = ""
                    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray), // color of the button
                        shape = RoundedCornerShape(20.dp), // shape of the button
                        border = BorderStroke(2.dp, Color.White), //  White border/Stroke
                        modifier = Modifier
                            .width(180.dp) ///width of the button
                            .padding(horizontal = 18.dp) //added padding space in dp horizontally to button
                            .height(50.dp)) // height of the button

                    {
                        Text(text = "Clear",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                        ) //font size, weight, color, alignment
                    }
                }
                Spacer(modifier = Modifier.height(20.dp)) //spacing using height

                Text(text = "Meal of the day suggestions: $food_name",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                ) //font size, weight, color, alignment
                Text(text = "") //displays results depending on time of the day


            }
        }
    }
}