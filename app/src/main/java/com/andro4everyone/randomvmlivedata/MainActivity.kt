package com.andro4everyone.randomvmlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var data: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Calling data with ViewModel implementation
        val model = ViewModelProviders.of(this).get(DataViewModel::class.java)
        val myRandomNumber = model.getNumber()

        //Calling data without ViewModel implementation
//        data = DataViewModel()
//        var myRandomNumber = data.getNumber()
        tvNumber.text = myRandomNumber
    }
}
