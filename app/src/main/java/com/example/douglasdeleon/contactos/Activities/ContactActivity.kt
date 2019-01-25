package com.example.douglasdeleon.contactos.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.douglasdeleon.contactos.App
import com.example.douglasdeleon.contactos.R
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity() {

    fun homeButton_Click (view: View){
        startActivity(Intent(this@ContactActivity, MainActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val item = App.contacts[App.itemPosition]

        name_textview.setText(item.name)
        number_textview.setText(item.number.toString())
        mail_textview.setText(item.email)

        number_textview.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number_textview.text.toString()))
            startActivity(intent)
        }


    }


}
