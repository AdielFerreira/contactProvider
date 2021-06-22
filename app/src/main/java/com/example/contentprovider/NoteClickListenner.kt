package com.example.contentprovider

import android.database.Cursor

interface NoteClickListenner {
    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}