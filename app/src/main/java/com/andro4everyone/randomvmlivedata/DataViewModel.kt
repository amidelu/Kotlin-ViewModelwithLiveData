package com.andro4everyone.randomvmlivedata

import androidx.lifecycle.ViewModel

//Extends ViewModel to keep out data intact
class DataViewModel: ViewModel() {

    private lateinit var myRandomNumber: String

    //This function will fetch random number
    fun getNumber(): String {

        //If random number is not initialized, this statement will call createNumber to generate random number
        if (!::myRandomNumber.isInitialized) {
            this.createNumber()
        }
        return myRandomNumber
    }

    //This function will generate random number
    fun createNumber() {

        val random = (1..10).random()
        myRandomNumber = "Number: $random"
    }
}