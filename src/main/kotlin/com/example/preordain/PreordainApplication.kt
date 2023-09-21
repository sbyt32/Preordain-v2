package com.example.preordain

import com.example.preordain.services.MessageService
import com.example.preordain.tables.TableEntry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class PreordainApplication

@RestController
class MessageController(val service: MessageService) {
	@GetMapping("/")
//	fun index(@RequestParam("name") name: String) = "Hello, $name!"
	fun index(): List<TableEntry> = service.getData()
}



fun main(args: Array<String>) {
	runApplication<PreordainApplication>(*args)
}

