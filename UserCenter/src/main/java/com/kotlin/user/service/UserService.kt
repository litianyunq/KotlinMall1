package com.kotlin.user.service

import rx.Observable


interface UserService {
    fun register(mobile: String, Code: String, pwd: String): Observable<Boolean>
    fun login(mobile: String, pwd: String): Observable<Boolean>
}