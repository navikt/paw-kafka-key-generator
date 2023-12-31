package no.nav.paw.kafkakeygenerator.database

import org.jetbrains.exposed.sql.Table

object KafkaKeysTabell: Table("KafkaKeys") {
    val id = long("id").autoIncrement()
    override val primaryKey = PrimaryKey(id, name = "PK_KafkaKeys")
}

