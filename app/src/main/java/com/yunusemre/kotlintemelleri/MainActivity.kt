package com.yunusemre.kotlintemelleri

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        println("Hello Kotlin !")

        println(5 * 20)

        // Variables

        var x = 5
        var y = 8
        println(x + y)

        x = 15
        // değişkenler en son değeri alır
        println("x = "+x)

        // Constans

        val name = "helena"
        println(name)
        val number_one = 55
        println(number_one + x)

        // Integer (Z)

        // defining
        val numberInt_one : Int
        /* or */
        var numberInt_two : Int = 8
        println(numberInt_two)

        // initialize
        numberInt_one = 14
        println(numberInt_one)

        // Double or Float (the best using double and long!)
        // Long
        var numberLong = 152.2552525
        println("numberLong : "+numberLong)

        var numberDouble_pi = 3.14
        val numberDouble_one : Double
        numberDouble_one = 10.5245562
        println(numberDouble_one)
        var numberFloat_one : Float
        numberFloat_one = 54.421f
        println("numberFloat_one : "+numberFloat_one)

        // String

        val word_one : String
        word_one = "yunus emre"
        println(word_one.capitalize()) // ilk harfi büyük yazdırır
        var string_one = "example first"
        var string_two = "example second"
        var string_result = string_one + " " +string_two
        println(string_result)

        // Boolean (true & false)

        val myBoolean : Boolean
        myBoolean = true
        println(4 < 10)

        // Conversion (Value change)

        val valueString = "10"
        val valueInt = valueString.toInt()
        println(valueInt * 20)

        // Collections (one or the more value)

        // Arrays
        val array_one = arrayOf("arrayExampleOne","arrayExampleTwo","arrayExampleThree")
        println(array_one.size)
        println(array_one[0])
        array_one[0] = "newArrayExampleOne"
        println(array_one[0])
        array_one.set(1,"newArrayExampleTwo")
        println(array_one[1])

        // List - ArrayList

        val arrayList_one = arrayListOf<String>("arrayListExampleOne","arrayListExampleTwo")
        println(arrayList_one.get(0))
        arrayList_one.add("arrayListExampleThree")
        println(arrayList_one[2])
        arrayList_one.add(0,"newArrayListExampleOne")
        println(arrayList_one[0])
        println(arrayList_one[1])

        val arrayList_two = ArrayList<Int>()
        arrayList_two.add(200)
        arrayList_two.add(500)
        arrayList_two.add(5422)
        arrayList_two.add(5481515)
        println(arrayList_two.size)

        val arrayList_three = ArrayList<Any>() // object
        arrayList_three.add("Yunus")
        arrayList_three.add(23)
        println(arrayList_three.size)

        // Set (The Lists using one element a lot of but here one using only)
        /* for example */

        val exampleList_one = arrayListOf<Int>(1,1,2,3,5)
        println(exampleList_one.size) // of 5 elements

        val exampleSetList_one = setOf<Int>(1,1,2,3)
        println(exampleSetList_one.size) // of 3 elements

        val exampleSetList_two = HashSet<String>()
        exampleSetList_two.add("Yunus")
        exampleSetList_two.add("Emre")
        exampleSetList_two.add("Yunus")
        println("exampleSetList_two : ${exampleSetList_two.size}")// for 2 elements
        // foreach
        exampleSetList_two.forEach { println(it) } // forecah, write of elements in list

        // Map - HashMap ( key - value )

        val sportClubPlayerMap = HashMap<String,String>()
        sportClubPlayerMap.put("Besiktas","Necip Uysal")
        sportClubPlayerMap.put("Galatasaray","Osimhen")
        println("${sportClubPlayerMap["Besiktas"]} and ${sportClubPlayerMap["Galatasaray"]}")

        val artArtistMap = hashMapOf<String,String>("Mona Lisa" to "Leonardo Da Vinci","Kaplumbağa Terbiyecisi" to "Osman Hamdi bey")//key to value
        println("${artArtistMap["Mona Lisa"]}")
        println(artArtistMap.size)

        // Operator
        var exampleNumber_one = 5
        println(exampleNumber_one)
        exampleNumber_one++
        println(exampleNumber_one)
        var exampleNumber_two = 12
        println(exampleNumber_two > exampleNumber_one)
        exampleNumber_one--
        // remainder
        println(exampleNumber_two % exampleNumber_one)

        // If Control
        println("----------- If Control --------------")
        val exampleNumberAge_one = 25
        val exampleNumberAge_two = 23
        if (exampleNumberAge_one > exampleNumberAge_two) {
            println("Age example one > age example two")
        }else {
            println("Age example one < age example two")
        }

        // Switch - When (Kotlin Version)
        println("----------- Switch - When --------------")
        val dayNumber = 5
        var dayString : String
        dayString = ""

        when(dayNumber) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> println("not define day")
        }
        println(dayString)

        // Loop

        // For Loop
        println("----------- For Loop --------------")
        val exampleArrayListNumbers = arrayListOf<Int>(1,2,3,4,5,6,7,8)
        var listNumber = exampleArrayListNumbers[0]
        val resultList = listNumber * 14 / 2
        println(resultList)

        // list version
        for (exampleForNumber in exampleArrayListNumbers) {
            var resultForNumber = exampleForNumber * 14 / 2
            println(resultForNumber)
        }
        // Dificult version
        for (exampleForNumber in exampleArrayListNumbers.indices) { // to index
            println(exampleArrayListNumbers[exampleForNumber])
        }
        // normal version
        for (x in 0..9){
            println(x)
        }

        // While Loop
        println("----------- While Loop --------------")

        var exampleWhileNumber = 0

        while (exampleWhileNumber <= 5){
            if (exampleWhileNumber != 0) {
                println(exampleWhileNumber)
            }
            exampleWhileNumber++
        }
    }
}