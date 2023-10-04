package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       /* val btnLogin: Button = findViewById(R.id.login)
        val txtUsername: EditText = findViewById(R.id.username)
        val txtPassword: EditText = findViewById(R.id.password)
        val logObj = Login()

        btnLogin.setOnClickListener {
            logObj.username = txtUsername.text.toString()
            logObj.password = txtPassword.text.toString()

            if (logObj.loginCheck() == true) {
                val intentLogin = Intent(this, HomeActivity::class.java)
                startActivity(intentLogin)
            } else {
                Toast.makeText(this, "username dan password salah", Toast.LENGTH_SHORT).show()
            }
        }*/
    }
}
