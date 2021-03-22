package com.example.mylibrary;

public class QPresenter implements QuContract.IPresenter{

    private QuContract.IView iView;

    public QPresenter(QuContract.IView iView) {
        this.iView = iView;
    }

    @Override
    public void queryData() {
        XiaModel model = new XiaModel();
        model.queryData(new XiaModel.ModelCollback() {
            @Override
            public void onSuccess(OneEntity oneEntity) {
                iView.queryDataSuccess(oneEntity);
            }

            @Override
            public void onError(int code, String msg) {
                iView.queryDataError(code,msg);
            }
        });
    }
}
