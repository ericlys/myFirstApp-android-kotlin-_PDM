package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*creating variables*/
    lateinit var name:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*capturing the value of PlainText by id*/
        name = findViewById(R.id.myName);


        /*performs the action by clicking on the showToast button, displaying "Hello" plus the name entered in the field with id myName*/
        showToast.setOnClickListener(
            {Toast.makeText(this@MainActivity, "Hello "+ name.text, Toast.LENGTH_SHORT).show()}
        )

    }
}
