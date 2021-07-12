package com.example.udemy_learnkotlin2.utils

import com.example.udemy_learnkotlin2.retrofit.RetrofitClient
import com.example.udemy_learnkotlin2.retrofit.UserApiClient

class Common {
    companion object {
        var BASE_URL: String = "https://jsonplaceholder.typicode.com/"

        fun getApi(): UserApiClient? {
            return RetrofitClient.getclient(BASE_URL)!!.create(UserApiClient::class.java)

        }

    }
}