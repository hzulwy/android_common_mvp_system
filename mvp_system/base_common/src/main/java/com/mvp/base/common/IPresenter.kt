package com.mvp.base.common

interface IPresenter<out V : IView<IPresenter<V>>> {
    fun getView(): V
    fun destroyView()
}