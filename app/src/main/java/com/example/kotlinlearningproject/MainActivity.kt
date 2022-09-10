package com.example.kotlinlearningproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Arrays
        val myArray = arrayOf("one","two","three");

        //lists
        val myArrayList = arrayListOf<Any>()
        val mixedArrayList  = arrayListOf(1,"car",3.3)

        //set
        val mySet = setOf<Int>(7,8,9,9,9,8,1)
        val otherSet = HashSet<String>()
        otherSet.add("Tesla")
        otherSet.add("Moon")
        otherSet.add("Bitcoin")

        //Map
        val populationMap = hashMapOf<String, Int>("Orlando" to 284_000)
        populationMap.put("Austin",965_000)
        populationMap.put("Adana",1_700_000)
        populationMap.put("San Francisco", 874_000)

        //when
        var scoreInt = 50;
        var scoreString = "";
        when(scoreInt){
            0 -> scoreString = "Invalid Score"
            50 -> scoreString = "Modarete Score"
            100 -> scoreString = "Well Score"
            else -> scoreString = "The score not understant"
        }
        Log.i("when",scoreString)

        //for_loop
        val ints = arrayOf(5,10,15,20,25,30)
        for(i in ints){
            Log.i("for_loop",""+i)
        }
        for(indices in ints.indices){
            Log.i("for_loop_indice",""+indices)
        }
        for(b  in 0..9){
            Log.i("for_loop_..",""+b)
        }
        ints.forEach {
            Log.i("for_loop_foreach",""+it)
        }

        //while
        var j=0
        while (j <= 10){
            Log.i("while_loop",""+j)
            j++
        }



    }
}