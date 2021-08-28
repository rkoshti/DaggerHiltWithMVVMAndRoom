package com.example.mvvmwithroom.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDAO {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user : User)

    @Query("SELECT * FROM tbl_user")
    fun getAllUsers() : LiveData<List<User>>

    @Query("SELECT * FROM tbl_user WHERE id == :userId")
    fun getUser(userId: Int) : LiveData<List<User>>

    @Delete
    suspend fun delete(user: User)
}