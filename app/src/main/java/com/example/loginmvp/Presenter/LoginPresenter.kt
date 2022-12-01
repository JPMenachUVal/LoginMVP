package com.example.loginmvp.Presenter

import com.example.loginmvp.Model.User
import com.example.loginmvp.View.ILoginView

class LoginPresenter (internal var iLoginView:ILoginView):ILoginPresenter {
    override fun onLogin(usuario: String, clave: String) {
        val user = User(usuario,clave)
        val isLoginSuccess = user.isDataValid
        if (isLoginSuccess)
            iLoginView.onLoginResult("Sesión iniciada")
        else
            iLoginView.onLoginResult("Usuario o contraseña incorrectos")
    }

}