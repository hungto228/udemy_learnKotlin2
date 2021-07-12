package com.example.udemy_learnkotlin2.retrofit

import com.example.udemy_learnkotlin2.model.PostModel
import com.example.udemy_learnkotlin2.model.UserModel
import io.reactivex.Observable
import retrofit2.http.GET

interface UserApiClient {
    @GET("users")
    fun listAllUser(): Observable<List<UserModel>>

    @GET("posts")
    fun lissAllPost():Observable<List<PostModel>>

}