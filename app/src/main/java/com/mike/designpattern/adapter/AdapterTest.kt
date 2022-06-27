package com.mike.designpattern.adapter

fun main(){

    //class adapter
    val adapterClass =  AdapterClass()
    adapterClass.apply {
        request1()
        request2()
    }

    //object adapter
    val adaptee = Adaptee()
    val adapterObj = AdapterObj(adaptee)
    adapterObj.apply {
        request1()
        request2()
    }
}