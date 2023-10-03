package com.example.host

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    fun hello() = "Hello world!";
    @GetMapping("/{name}")
    fun hello(@PathVariable(name = "name") name: String) = "Hello $name!";
}

@SpringBootApplication
class HostApplication

fun main(args: Array<String>) {
    runApplication<HostApplication>(*args)
}
