package com.example.yeqing.logisticsapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yeqing.logisticsapp.R;
import com.example.yeqing.logisticsapp.adapter.SearchAdapter;
import com.example.yeqing.logisticsapp.entity.CustomerRequireEntity;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private List<CustomerRequireEntity> customerRequireEntityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        initCustomers();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.search_listview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        SearchAdapter adapter = new SearchAdapter(customerRequireEntityList);
        recyclerView.setAdapter(adapter);

    }

    private void initCustomers() {
        for(int i = 0; i < 50; i ++) {
            CustomerRequireEntity customer = new CustomerRequireEntity();
            customerRequireEntityList.add(customer);
        }

    }
}
