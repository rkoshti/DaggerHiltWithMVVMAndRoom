package com.example.mvvmwithroom.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user")
data class User(
    var firstName:String? = null
){
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null
}