package com.example.testapplicationinterview.ui.utils

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.annotation.RequiresApi

class CommonHelper {

    companion object{
        @RequiresApi(Build.VERSION_CODES.CUPCAKE)
        @JvmStatic
        fun hideKeyboard(activity: Activity) {
            val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            //Find the currently focused view, so we can grab the correct window token from it.
            var view = activity.currentFocus
            //If no view currently has focus, create a new one, just so we can grab a window token from it
            if (view == null) {
                view = View(activity)
            }
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }

        fun getTextFromEdt(edt: EditText): String {
            return edt.text.toString()

        }
    }
}