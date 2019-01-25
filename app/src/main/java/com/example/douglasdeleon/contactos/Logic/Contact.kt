package com.example.douglasdeleon.contactos.Logic

data class Contact (val name: String, val number: Int ,val email: String) {
    override fun toString(): String {
        return "$name: $number"
    }
}