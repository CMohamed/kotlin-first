package com.chadad.gmbh.repositories

import com.chadad.gmbh.entities.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository: CrudRepository<Message, String> {

    @Query("select * from messages")
    fun findMessages(): List<Message>
}