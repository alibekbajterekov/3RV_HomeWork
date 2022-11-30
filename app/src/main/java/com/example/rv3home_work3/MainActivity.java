package com.example.rv3home_work3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList cityList = new ArrayList();
    private RecyclerView rvCity;
    private RecyclerView.Adapter cityAdapter = new CityAdapter(cityList);


    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCity = findViewById(R.id.rv_city);
        loadData();
        rvCity.setAdapter(cityAdapter);
    }

    private void loadData() {
        cityList.add("Москва");
        cityList.add("Питер");
        cityList.add("Волгоград");
        cityList.add("Астрахань");
        cityList.add("Ижевск");
        cityList.add("Ростов");
        cityList.add("Ростов на Дону");
        cityList.add("Самара");
        cityList.add("Новосибирск");
        cityList.add("Красноярск");
        cityList.add("Краснодар");
        cityList.add("Нальчик");
        cityList.add("Махачкала");
        cityList.add("Барнаул");
    }
}