package com.belvin.workshopdemoproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.belvin.workshopdemoproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity OnCreate", "Called")
        var textview = findViewById<View>(R.id.textviewTest)
        var buttonSubmit = findViewById<View>(R.id.buttonSubmit)
        var male = findViewById<RadioButton>(R.id.radioButtonMale)
        var female = findViewById<RadioButton>(R.id.radioButtonFemale)
        var edName = findViewById<EditText>(R.id.edittextName)

        textview.setOnClickListener {
            Log.e("clickLabel", "Yes")
        }

        buttonSubmit.setOnClickListener {
            if (edName.text.toString() == "") {
                Toast.makeText(this, "Please enter Name", Toast.LENGTH_SHORT).show()
            } else {
                if (male.isChecked) {
                    Toast.makeText(this, "Select -->male", Toast.LENGTH_SHORT).show()
                } else {
                    Log.e("Select Gender-->", "FeMale")
                    Toast.makeText(this, "Select -->Female", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu1 -> {
                Toast.makeText(this, "Select Menu ---> Menu Item 1", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        Log.d("MainActivity OnStart", "Called")
        super.onStart()
    }

    override fun onPause() {
        Log.d("MainActivity OnPause", "Called")
        super.onPause()
    }

    override fun onResume() {
        Log.d("MainActivity OnResume", "Called")
        super.onResume()
    }

    override fun onStop() {
        Log.d("MainActivity OnStop", "Called")
        super.onStop()
    }
}