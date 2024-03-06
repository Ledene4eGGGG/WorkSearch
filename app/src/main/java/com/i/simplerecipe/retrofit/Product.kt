package com.i.simplerecipe.retrofit

data class Product (
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val image: String
)
