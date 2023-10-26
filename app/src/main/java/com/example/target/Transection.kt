package com.example.target

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.Date

@Entity(tableName = "transaction")
data class Transaction(
    @PrimaryKey(autoGenerate = true)val id:Int,
            val label: String,
            val amount: Double,
            val description: String): Serializable{

}

