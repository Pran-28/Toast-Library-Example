package com.example.toaster

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun ToasterMsg(context: Context, msg:String){
        Toast.makeText(context, msg,Toast.LENGTH_SHORT).show()
    }

}