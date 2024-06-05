package com.i.simplerecipe.retrofit


data class Product (
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val image: String
)
data class BreakfastDishes(
    val id: Int,
    val name: String,
    val image: Int,
    val steps: String,
)
data class Ingridients(
    val name: String
)
data class RecepiDayResponse (
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val image: String,
    val instruction: String

)
