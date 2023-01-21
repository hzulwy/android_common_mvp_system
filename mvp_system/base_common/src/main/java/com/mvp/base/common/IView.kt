package com.mvp.base.common

interface IView<out P : IPresenter<IView<P>>> {

    fun onCreatePresenter(): P?
    fun getPresenter(): P?
}
