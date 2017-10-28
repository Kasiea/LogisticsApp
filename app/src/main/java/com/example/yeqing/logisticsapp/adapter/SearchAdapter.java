package com.example.yeqing.logisticsapp.adapter;


import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yeqing.logisticsapp.R;
import com.example.yeqing.logisticsapp.entity.CustomerRequireEntity;

import java.util.List;

/**
 * Created by yeqing on 2017/10/28.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder>{

    private List<CustomerRequireEntity> customerRequireEntityList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View view) {
            super(view);
        }
    }

    public SearchAdapter(List<CustomerRequireEntity> customerRequireEntityList){
        this.customerRequireEntityList = customerRequireEntityList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_search, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CustomerRequireEntity customer = customerRequireEntityList.get(position);


    }

    @Override
    public int getItemCount() {
        return customerRequireEntityList.size();
    }




}
