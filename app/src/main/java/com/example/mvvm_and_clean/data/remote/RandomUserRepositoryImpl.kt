package com.example.mvvm_and_clean.data.remote

import com.example.mvvm_and_clean.data.mappers.toDomain
import com.example.mvvm_and_clean.domain.model.RandomUser
import com.example.mvvm_and_clean.domain.repository.RandomUserRepository
import com.example.mvvm_and_clean.domain.util.Resource
import javax.inject.Inject

class RandomUserRepositoryImpl @Inject constructor(
    private val randomUserApi: RandomUserApi
): RandomUserRepository {
    override suspend fun fetchRandomUser(): Resource<RandomUser> {
        return try {
            Resource.Success(
                data = randomUserApi.fetchRandomUser().results.first().toDomain()
            )
        } catch (e: Exception){
            Resource.Error(
                message = "Unknown error"
            )
        }
    }
}