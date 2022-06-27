package com.mike.designpattern.decorator

fun Panda.bamboo(decorator:()->Unit){
    eat()
    println("Bamboo_kotlin")
    decorator()
}

fun Panda.carrot(decorator:()->Unit){
    println("Carrot_kotlin")
    decorator()
}

fun main(){
    Panda().run {
        bamboo {
            carrot {  }
        }
    }
}