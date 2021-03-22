package com.example.mylibrary;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

public class XiaModel implements QuContract.IModel{

    @Override
    public void queryData(ModelCollback collback) {
        OkGo.<String>get("http://www.58cangshu.com/app/tk/v2/getGoodsOpt?parent_opt_id=0").execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                String body = response.body();
                if (body != null){
                    OneEntity oneEntity = new Gson().fromJson(body, OneEntity.class);
                    collback.onSuccess(oneEntity);
                }
            }
        });
    }

    interface ModelCollback{
        void onSuccess(OneEntity oneEntity);
        void onError(int code,String msg);
    }

}
