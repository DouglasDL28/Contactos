package com.example.douglasdeleon.contactos.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.douglasdeleon.contactos.App
import com.example.douglasdeleon.contactos.Logic.Contact
import com.example.douglasdeleon.contactos.R
import kotlinx.android.synthetic.main.activity_new_contact.*

class NewContactActivity : AppCompatActivity() {

    fun homeButton_onClick (view: View) {
        startActivity(Intent(this@NewContactActivity, MainActivity::class.java))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_contact)

        createButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

                val name = contactName.text.toString()
                val number = contactNumber.text.toString().toInt()
                val email = contactMail.text.toString()

                App.contacts.add(Contact(name, number, email))

                Toast.makeText(this@NewContactActivity, "Se ha agregado con éxito.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
