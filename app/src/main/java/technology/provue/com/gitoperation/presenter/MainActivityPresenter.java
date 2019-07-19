package technology.provue.com.gitoperation.presenter;

import android.view.View;

import technology.provue.com.gitoperation.contract.MainActivityContract;
import technology.provue.com.gitoperation.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View mView) {
        this.mView = mView;
        intiateModel();
    }

    private void intiateModel(){

        mView.initWidgets();
        mModel = new MainActivityModel();


    }

    @Override
    public void onClick(View view) {

        String message = mModel.generateMessage();
        mView.displayMessage(message);
    }
}//end of class
