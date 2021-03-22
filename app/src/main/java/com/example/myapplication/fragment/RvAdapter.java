package com.example.myapplication.fragment;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.myapplication.R;
import com.example.mylibrary.OneEntity;

import java.util.List;

import androidx.annotation.Nullable;

public class RvAdapter extends BaseQuickAdapter<OneEntity.EntityDTO.GoodsOptGetResponseDTO.GoodsOptListDTO, BaseViewHolder> {

    public RvAdapter(int layoutResId, @Nullable List<OneEntity.EntityDTO.GoodsOptGetResponseDTO.GoodsOptListDTO> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, OneEntity.EntityDTO.GoodsOptGetResponseDTO.GoodsOptListDTO item) {
        helper.setText(R.id.text,item.getOpt_name());
    }
}
