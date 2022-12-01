package com.example.loginmvp.Model

import android.text.TextUtils

class User (override val usuario:String, override val clave:String):IUser {
    override val isDataValid: Boolean
        get() = (!TextUtils.isEmpty(usuario) && usuario == u.usuario &&
                    clave.length > 6 && clave == u.clave)
}

val u = User("carlitos","1234567")
