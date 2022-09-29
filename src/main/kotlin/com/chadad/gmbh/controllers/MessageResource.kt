package com.chadad.gmbh.controllers

import com.chadad.gmbh.entities.Message
import com.chadad.gmbh.services.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val messageService: MessageService) {
    @GetMapping
    fun index(): List<Message> = messageService.findMessages()

    @PostMapping
    fun post(@RequestBody messageRequest: Message) {
        messageService.post(messageRequest)
    }


}
