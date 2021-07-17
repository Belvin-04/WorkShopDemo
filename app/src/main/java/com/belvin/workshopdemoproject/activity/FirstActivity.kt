package com.belvin.workshopdemoproject.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.belvin.workshopdemoproject.R
import com.belvin.workshopdemoproject.fragment.FragmentFirst
import com.belvin.workshopdemoproject.fragment.FragmentSecond
import kotlinx.android.synthetic.main.activity_first.*
import java.net.URI

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.d("First OnCreate", "Called")
        var fm:FragmentManager=this.supportFragmentManager
        var transaction=fm.beginTransaction()
        transaction.add(R.id.framelayoutContainer,FragmentFirst())
        transaction.commit()

        OpenBrowser.setOnClickListener {
            openBrowser()
        }

        NxtBtn.setOnClickListener {

            //------EXAMPLE OF EXPLICIT INTENT--------//
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)

        }
        fragment1.setOnClickListener {
            loadFragment(FragmentFirst())
        }

        fragment2.setOnClickListener {
            loadFragment(FragmentSecond())
        }

    }

    private fun openBrowser(){
        //------EXAMPLE OF IMPLICIT INTENT--------//
    var intent=Intent()
        intent.setAction(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("http://google.com"))
        startActivity(intent)
    }
    private fun loadFragment(fragment:Fragment){
        var fm:FragmentManager=this.supportFragmentManager
        var transaction=fm.beginTransaction()
        transaction.replace(R.id.framelayoutContainer,fragment)
        transaction.commit()
    }

    override fun onStart() {
        Log.d("First OnStart", "Called")
        super.onStart()
    }

    override fun onPause() {
        Log.d("First OnPause", "Called")
        super.onPause()
    }

    override fun onResume() {
        Log.d("First OnResume", "Called")
        super.onResume()
    }

    override fun onStop() {
        Log.d("First OnStop", "Called")
        super.onStop()
    }
}