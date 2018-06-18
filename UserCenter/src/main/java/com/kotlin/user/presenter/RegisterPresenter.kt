package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl


class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, code: String, pwd: String) {
        val userServiceImpl = UserServiceImpl()
        userServiceImpl.register(mobile, code, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }

    fun login(mobile: String, pwd: String) {
        val userServiceImpl = UserServiceImpl()
        userServiceImpl.login(mobile, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }
}