package com.example.douglasdeleon.contactos.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.douglasdeleon.contactos.R

class MailActivity : AppCompatActivity() {

    fun sendButton_onClick (view: View) {
        Toast.makeText(this@MailActivity, "")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail)


    }
}
