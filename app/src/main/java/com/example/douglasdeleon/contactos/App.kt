package com.example.douglasdeleon.contactos

import android.app.Application
import com.example.douglasdeleon.contactos.Logic.Contact

class App: Application() {
    companion object {
        val contacts: ArrayList<Contact> = arrayListOf()

        var itemPosition: Int = 0
    }
}