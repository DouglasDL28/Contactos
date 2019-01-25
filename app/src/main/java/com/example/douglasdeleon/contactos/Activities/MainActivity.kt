package com.example.douglasdeleon.contactos.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.douglasdeleon.contactos.App
import com.example.douglasdeleon.contactos.R

class MainActivity : AppCompatActivity() {

    fun newContactButton_Click (view: View){
        startActivity(Intent(this@MainActivity, NewContactActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.contactsListView)

        val adapter = ArrayAdapter(this@MainActivity, R.layout.item, App.contacts) //Conexión del listView y el adapter para mostrar la lista.

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            App.itemPosition = position

            startActivity(Intent(this@MainActivity, ContactActivity::class.java))
        }
    }
}
