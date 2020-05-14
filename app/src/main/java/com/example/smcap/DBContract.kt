package com.example.smcap

import android.provider.BaseColumns

object DBContract {

    /* Clasa care defineste continutul tabelului*/
    class UserEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "users"
            val ID = "userid"
            val NUME = "name"
            val VARSTA = "age"
        }
    }
}