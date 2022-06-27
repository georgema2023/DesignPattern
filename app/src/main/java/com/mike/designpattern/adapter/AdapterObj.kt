package com.mike.designpattern.adapter


class AdapterObj(private var adaptee:Adaptee):Target {
    override fun request1() {
        adaptee.request1()
    }

    override fun request2() {
        println("AdapterObj: request2")
    }
}