package com.shreks

import java.util.*

class Person {

    var name = ""
    var l_name = ""

    constructor(_name: String){
        name = _name
    }

    constructor(_name: String, _l_name: String){
        name = _name
        l_name = _l_name
    }

    fun display_name(){
        println("Hello, my name is $name")
    }

    fun display_fullname(){
        println("Hello, my name is $name $l_name")
    }
}