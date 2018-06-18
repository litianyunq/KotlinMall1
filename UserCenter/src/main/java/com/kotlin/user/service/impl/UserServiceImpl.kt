package com.kotlin.user.service.impl

import com.kotlin.user.service.UserService
import rx.Observable

class UserServiceImpl : UserService {
    override fun login(mobile: String, pwd: String): Observable<Boolean> {
        return Observable.just(true);
    }

    override fun register(mobile: String, Code: String, pwd: String): Observable<Boolean> {

        return Observable.just(true);
    }
}