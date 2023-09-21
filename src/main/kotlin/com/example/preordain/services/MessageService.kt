package com.example.preordain.services

import com.example.preordain.tables.TableEntry
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class MessageService(val db: JdbcTemplate) {
    fun getData(): List<TableEntry> = db.query("select * from sample_table") { response, _ ->
        TableEntry(
            response.getInt("id"),
            response.getString("name"),
            response.getString("extras")
        )
    }
}