package com.nikasov.mynote.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.nikasov.mynote.interfaces.MainView;
import com.nikasov.mynote.utils.LogMe;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void doSomething(){
        getViewState().showLoading();
    }
}
