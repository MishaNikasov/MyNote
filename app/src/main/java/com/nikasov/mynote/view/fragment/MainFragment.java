package com.nikasov.mynote.view.fragment;


import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.nikasov.mynote.R;
import com.nikasov.mynote.interfaces.MainView;
import com.nikasov.mynote.presenter.MainPresenter;
import com.nikasov.mynote.utils.LogMe;
import com.nikasov.mynote.utils.ViewUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainFragment extends MvpAppCompatFragment implements MainView {

    @InjectPresenter
    MainPresenter presenter;

    public MainFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.start)
    void doIt(){
        presenter.doSomething();
    }

    @Override
    public void showLoading() {
        ViewUtils.showToast(getContext(), "End");
    }
}
