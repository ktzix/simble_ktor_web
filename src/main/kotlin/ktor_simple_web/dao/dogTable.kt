package ktor_simple_web.dao

import org.jetbrains.exposed.sql.Table

object dogTable: Table(){

    val id = integer("id").primaryKey().autoIncrement()
    val name = varchar("name", 20)
    val age = integer("age")

}