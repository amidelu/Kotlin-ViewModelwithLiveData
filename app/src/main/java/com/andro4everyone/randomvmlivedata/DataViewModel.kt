package com.andro4everyone.randomvmlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Extends ViewModel to keep out data intact
class DataViewModel: ViewModel() {

    //using mutable LiveData to fetch data
    private lateinit var myRandomNumber: MutableLiveData<String>

    //This function will fetch random number
    fun getNumber(): MutableLiveData<String> {

        //If random number is not initialized, this statement will call createNumber to generate random number
        if (!::myRandomNumber.isInitialized) {
            myRandomNumber = MutableLiveData()
            this.createNumber()
        }
        return myRandomNumber
    }

    //This function will generate random number
    fun createNumber() {
        val random = (1..10).random()
        myRandomNumber.value = "Number: $random"
    }
}