package com.example.mvvmwithroom.repositories

import com.example.mvvmwithroom.db.User
import com.example.mvvmwithroom.db.UserDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val userDao : UserDAO
) {

    suspend fun insert(user: User) = userDao.insert(user)
    suspend fun delete(user: User) = userDao.delete(user)

    fun getUsers() =  userDao.getAllUsers()
    fun getUser (id:Int) = userDao.getUser(id)

}