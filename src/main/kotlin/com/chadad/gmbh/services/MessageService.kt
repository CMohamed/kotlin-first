package com.chadad.gmbh.services

import com.chadad.gmbh.entities.Message
import com.chadad.gmbh.repositories.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}