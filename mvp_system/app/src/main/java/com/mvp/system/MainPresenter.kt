package com.mvp.system

import com.mvp.base.common.BasePresenter

class MainPresenter(view: MainActivity?) : BasePresenter<MainActivity>(view) {

    //这里可以添加所有需要提供给mainactivity的方法

    fun getMessage(): String {
        return "MainPresenter"
    }
}