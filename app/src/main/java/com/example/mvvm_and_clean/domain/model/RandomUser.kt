package com.example.mvvm_and_clean.domain.model

data class RandomUser(
    val name:String,
    val email: String,
    val birthday:String,
    val age: Int,
    val address: String,
    val phone: String,
    val password: String,
    val photo: String
        )