package com.andro4everyone.randomvmlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var data: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = DataViewModel()
        var myRandomNumber = data.getNumber()
        tvNumber.text = myRandomNumber
    }
}
