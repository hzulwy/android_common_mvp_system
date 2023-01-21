package com.mvp.system

import android.os.Bundle
import android.widget.Toast
import com.mvp.base.common.BaseActivity
import com.mvp.base.common.IPresenter
class MainActivity : BaseActivity<IPresenter<MainActivity>>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, (getPresenter() as MainPresenter).getMessage(), Toast.LENGTH_SHORT)
            .show()
        getPresenter()
    }

    override fun onCreatePresenter(): MainPresenter? {
        return MainPresenter(this)
    }


}