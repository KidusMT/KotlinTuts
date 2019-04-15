package com.itsc.kotlintuts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // different types of onClickListener initializition ways
//        btnClick.setOnClickListener(View.OnClickListener { view: View? -> onClick() })
//        btnClick.setOnClickListener({ view: View? -> onClick() })
//        btnClick.setOnClickListener({ View -> onClick() })
//        btnClick.setOnClickListener{onClick()}
    }

    fun onClick(): Unit { // Unit -> equivalent of void in java
        Toast.makeText(this, "onClick clicked", Toast.LENGTH_SHORT).show()
//        Log.e(MainActivity::class.java.simpleName, "onClick clicked");
    }
}
