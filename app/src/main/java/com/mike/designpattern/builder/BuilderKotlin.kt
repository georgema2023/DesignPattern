package com.mike.designpattern.builder

fun main() {
    val pen = Pen()
    with(pen, {
        color = "red"
        width = 2f
        round = true
    })
    pen.write()

    pen.apply {
        color = "gray"
        width = 3f
        round = false
        write()
    }
}