package com.example.preordain.tables

import org.springframework.data.relational.core.mapping.Table

@Table("sample_table")
data class TableEntry(val id: Int, val name: String, val extras: String?)