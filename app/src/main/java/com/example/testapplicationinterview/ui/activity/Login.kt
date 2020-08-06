package com.example.testapplicationinterview.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testapplicationinterview.R
import com.example.testapplicationinterview.ui.utils.CommonHelper
import com.example.testapplicationinterview.ui.utils.ValidateFormInput
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_masuk.setOnClickListener { actionLogin()}

    }

    private fun validateFormInput(): Boolean =
                ValidateFormInput.validateEmpty(edt_nama) &&
                ValidateFormInput.validateEmpty(edt_password)

    private fun actionLogin() {
        CommonHelper.hideKeyboard(this@Login)

        if (ValidateFormInput.validateEmpty(edt_nama)) {
            Toast.makeText(this@Login, "Masukkan Nama Anda", Toast.LENGTH_SHORT).show()

            if (ValidateFormInput.validateEmpty(edt_password)) {
                Toast.makeText(this@Login, "Masukkan Password Anda", Toast.LENGTH_SHORT).show()
                return
            }

//        callApi()
        }
    }
}
