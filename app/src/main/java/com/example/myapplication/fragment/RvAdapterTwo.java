package com.example.myapplication.fragment;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.myapplication.R;
import com.example.myapplication.entity.TwoEntity;

import java.util.List;

import androidx.annotation.Nullable;

public class RvAdapterTwo extends BaseQuickAdapter<TwoEntity.EntityDTO, BaseViewHolder> {
    public RvAdapterTwo(int layoutResId, @Nullable List<TwoEntity.EntityDTO> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TwoEntity.EntityDTO item) {
        helper.setText(R.id.text,item.getOpt_name());
        Glide.with(mContext).load("http:\\"+item.getImage()).into((ImageView) helper.getView(R.id.img));
    }
}
