package com.example.mylibrary;

public interface QuContract {

    interface IPresenter{
        void queryData();
    }

    interface IModel{
        void queryData(XiaModel.ModelCollback collback);
    }

    interface IView{
        void queryDataSuccess(OneEntity oneEntity);
        void queryDataError(int code,String msg);
    }
}
