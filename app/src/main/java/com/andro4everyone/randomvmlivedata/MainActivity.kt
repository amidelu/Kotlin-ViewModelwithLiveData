package com.andro4everyone.randomvmlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Calling data with ViewModel implementation
        val model = ViewModelProviders.of(this).get(DataViewModel::class.java)
        val myRandomNumber = model.getNumber()

        //setting observer for data change of myRandomNumber LiveData in DataViewModel class
        myRandomNumber.observe(this, Observer<String> { number ->
            tvNumber.text = number
        })

        btnRandom.setOnClickListener {
            model.createNumber()
        }
    }
}
