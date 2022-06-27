package com.mike.designpattern.adapter

class AdapterClass: Adaptee(),Target {
    override fun request2() {
        println("AdapterClass: request2")
    }
}