package com.example.mvvm_and_clean.domain.repository

import com.example.mvvm_and_clean.domain.model.RandomUser
import com.example.mvvm_and_clean.domain.util.Resource

interface RandomUserRepository {
    suspend fun fetchRandomUser(): Resource<RandomUser>
}