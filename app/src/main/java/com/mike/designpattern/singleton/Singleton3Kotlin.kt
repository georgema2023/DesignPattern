package com.mike.designpattern.singleton

class Singleton3Kotlin private constructor(){
    companion object{
        val INSTANCE:Singleton3Kotlin by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
            Singleton3Kotlin()
        }
    }
}