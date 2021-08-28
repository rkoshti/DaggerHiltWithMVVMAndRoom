package com.example.mvvmwithroom.ui.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmwithroom.db.User

import com.example.mvvmwithroom.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
): ViewModel() {

    fun insertUser(user: User) = viewModelScope.launch {
        mainRepository.insert(user)
    }

    fun getAllUsers() = viewModelScope.launch {
        mainRepository.getUsers()
    }

    fun getUser(userId: Int) = viewModelScope.launch {
        mainRepository.getUser(userId)
    }
}