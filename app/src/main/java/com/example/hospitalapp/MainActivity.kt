package com.example.hospitalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        var getpname=findViewById<EditText>(R.id.pname)
        var getdname=findViewById<EditText>(R.id.dname)
        var getsym=findViewById<EditText>(R.id.sym)

        Toast.makeText(this,getpname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getdname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getsym.text.toString(),Toast.LENGTH_LONG).show()
    }
}