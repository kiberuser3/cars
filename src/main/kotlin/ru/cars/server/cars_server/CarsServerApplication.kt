package ru.cars.server.cars_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarsServerApplication

fun main(args: Array<String>) {
	runApplication<CarsServerApplication>(*args)
}
