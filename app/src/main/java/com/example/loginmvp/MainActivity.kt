package com.example.loginmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginmvp.Presenter.ILoginPresenter
import com.example.loginmvp.Presenter.LoginPresenter
import com.example.loginmvp.View.ILoginView
import com.example.loginmvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ILoginView {

    private lateinit var binding: ActivityMainBinding

    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Init
        loginPresenter = LoginPresenter(this)

        //Evento
        binding.btnLogin.setOnClickListener {
            loginPresenter.onLogin(binding.etUsuario.text.toString(), binding.etClave.text.toString())
        }
    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}