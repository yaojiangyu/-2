package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.myapplication.R;
import com.example.myapplication.entity.TwoEntity;
import com.example.mylibrary.OneEntity;
import com.example.mylibrary.QPresenter;
import com.example.mylibrary.QuContract;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

public class TwoFragment extends Fragment implements QuContract.IView {

    private RecyclerView rv;
    private List<OneEntity.EntityDTO.GoodsOptGetResponseDTO.GoodsOptListDTO> list = new ArrayList<>();
    private QuContract.IPresenter presenter;
    private RvAdapter rvAdapter;
    private RecyclerView rvleft;
    private RvAdapterTwo rvAdapterTwo;
    private List<TwoEntity.EntityDTO> Tlist = new ArrayList<>();
    private DrawerLayout drawer;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_two, container, false);

        rv = (RecyclerView) inflate.findViewById(R.id.rv);
        rvleft = (RecyclerView) inflate.findViewById(R.id.rvleft);
        drawer = (DrawerLayout) inflate.findViewById(R.id.drawer);

        presenter = new QPresenter(this);
        presenter.queryData();

        rvAdapter = new RvAdapter(R.layout.item,list);
        rv.setAdapter(rvAdapter);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        rvAdapterTwo = new RvAdapterTwo(R.layout.item_two,Tlist);
        rvleft.setAdapter(rvAdapterTwo);
        rvleft.setLayoutManager(new LinearLayoutManager(getActivity()));

        rvAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });

        OkGo.<String>get("http://www.58cangshu.com/app/tk/v2/getGoodsOpt?parent_opt_id=14").execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                String body = response.body();
                if (body != null){
                    TwoEntity twoEntity = new Gson().fromJson(body, TwoEntity.class);
                    List<TwoEntity.EntityDTO> entity = twoEntity.getEntity();
                    Tlist.addAll(entity);
                    rvAdapterTwo.notifyDataSetChanged();
                }
            }
        });

        return inflate;
    }

    @Override
    public void queryDataSuccess(OneEntity oneEntity) {
        List<OneEntity.EntityDTO.GoodsOptGetResponseDTO.GoodsOptListDTO> goods_opt_list = oneEntity.getEntity().getGoods_opt_get_response().getGoods_opt_list();
        list.addAll(goods_opt_list);
        rvAdapter.notifyDataSetChanged();
    }

    @Override
    public void queryDataError(int code, String msg) {

    }
}