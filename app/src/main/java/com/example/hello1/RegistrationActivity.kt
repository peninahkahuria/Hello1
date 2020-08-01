package com.example.hello1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

private var View.text: Any
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    set(value) {}

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        btnSignIn.setOnClickListener {
            var firstName=etFirstName.text.toString()
            var lastName=etLastName.text.toString()
            val email=etEmail.text.toString()
            var phoneNumber=etPhoneNumber.text.toString()
            var password=etPassword.text.toString()
            var confirmpassword=etConfirmPassword.text.toString()
            Toast.makeText(baseContext,lastName,Toast.LENGTH_LONG).show()

        }

    }
}



