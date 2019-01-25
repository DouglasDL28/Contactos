package com.example.douglasdeleon.contactos

import android.app.Application
import com.example.douglasdeleon.contactos.Logic.Contact

class App: Application() {
    companion object {
        val contacts: ArrayList<Contact> = arrayListOf(Contact("Douglas", 12345678, "ddeleonmolina@gmail.com"))

        var itemPosition: Int = 0
    }
}