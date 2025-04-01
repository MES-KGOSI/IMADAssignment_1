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
                mutableStateOf("")
            }

            var food_name by remember {
                mutableStateOf("")

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff212121))


            ) {
                Text(
                    text = "Hera Nutritions",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "When searching utilise the time of the day please see below:",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(16.dp))
                    Text(text = "Morning",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                    )
                    Text(text = "Mid-morning",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                    )
                    Text(text = "Afternoon",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                    )
                    Text(text = "Mid-afternoon",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                    )
                    Text(text = "Dinner",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                    )
                    Text(text = "Dessert",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                    )

                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(value = time_of_the_day, onValueChange = { text ->

                    time_of_the_day = text

                },

                    placeholder = {
                        Text(text = "Enter your meal of the day here",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.LightGray,
                            textAlign = TextAlign.Center,
                            )
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

                Spacer(modifier = Modifier.height(20.dp))
                    Row {

                        Button(onClick = {
                            food_name = when (time_of_the_day) {
                                "Morning" -> "Cereal and Yoghurt OR Eggs, Bacon and Bread OR Croissant with Ham and Cheese"
                                "Mid-morning" -> "Smoothie OR Yoghurt OR Energy Bar"
                                "Afternoon" -> "Sandwich OR Pasta OR Burger and fries"
                                "Mid-afternoon" -> "Chips OR Protein Bar OR Sweets"
                                "Dinner" -> "Spaghetti Meatballs OR Pizza OR Steak with Salad and Mash Potatoes"
                                "Dessert" -> "Apple or Milk Tart OR Ice-cream OR Malva Pudding"
                                else -> "Invalid time of the day"

                            }

                        }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                            shape = RoundedCornerShape(20.dp),
                            border = BorderStroke(2.dp, Color.White), //  White border/Stroke
                            modifier = Modifier
                                .width(180.dp)
                                .padding(horizontal = 18.dp)
                                .height(50.dp))


                        {
                            Text(text = "Search",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                )
                        }
                        Spacer(modifier = Modifier.width(30.dp))

                        Button(onClick = {
                            time_of_the_day = ""
                            food_name = ""
                        }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                            shape = RoundedCornerShape(20.dp),
                            border = BorderStroke(2.dp, Color.White), //  White border/Stroke
                            modifier = Modifier
                                .width(180.dp)
                                .padding(horizontal = 18.dp)
                                .height(50.dp))

                        {
                            Text(text = "Clear",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                            )
                        }
                    }
                Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "Meal of the day suggestions: $food_name",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                        )
                    Text(text = "")


                }
            }
        }
    }


