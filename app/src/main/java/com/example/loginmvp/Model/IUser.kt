package com.example.loginmvp.Model

interface IUser {
    val usuario:String
    val clave: String
    val isDataValid: Boolean
}