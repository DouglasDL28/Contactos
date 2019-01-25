package com.example.douglasdeleon.contactos.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.douglasdeleon.contactos.App
import com.example.douglasdeleon.contactos.Logic.MailReceiver
import com.example.douglasdeleon.contactos.R
import kotlinx.android.synthetic.main.activity_contact.*
import android.widget.Toast



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


        mail_textview.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "message/rfc822"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(mail_textview.text.toString()))
            intent.putExtra(Intent.EXTRA_TEXT, "mi nombre es ${name_textview.text} y mi número es ${number_textview.text}")
            try {
                startActivity(Intent.createChooser(intent, "Send mail..."))
            } catch (ex: android.content.ActivityNotFoundException) {
                Toast.makeText(this@ContactActivity, ":(", Toast.LENGTH_SHORT).show()
            }

        }

    }


}
