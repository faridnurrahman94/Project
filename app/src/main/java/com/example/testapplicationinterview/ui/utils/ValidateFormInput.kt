package com.example.testapplicationinterview.ui.utils

import android.widget.EditText

class ValidateFormInput {

    companion object{
        fun validateEmpty(editText: EditText?): Boolean {
            if (editText == null) return false

            return editText.text.toString().isNotEmpty()
        }
    }
}