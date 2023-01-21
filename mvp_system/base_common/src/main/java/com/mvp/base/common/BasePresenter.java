package com.mvp.base.common;

import androidx.annotation.Nullable;

public class BasePresenter<V extends IView<IPresenter<V>>> implements IPresenter<V> {

    private V mView;

    public BasePresenter(V view) {
        this.mView = view;
    }

    @Nullable
    @Override
    public V getView() {
        return mView;
    }

    @Override
    public void destroyView() {
        mView = null;
    }
}
