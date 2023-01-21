package com.mvp.base.common

import androidx.appcompat.app.AppCompatActivity

public abstract class BaseActivity<P : IPresenter<IView<P>>> : AppCompatActivity(), IView<P> {

    private var mPresenter: P? = null

    override fun onCreatePresenter(): P? {
        return null
    }

    override fun getPresenter(): P? {
        mPresenter?.let {
            return mPresenter
        }
        mPresenter = onCreatePresenter()
        return mPresenter
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.destroyView()
    }
}