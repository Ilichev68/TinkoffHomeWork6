package com.example.user.tinkoffhomework6;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exclusionBtn = findViewById(R.id.ex_btn);
        Button deserializeBtn = findViewById(R.id.des_btn);
        Button toBigDecimal = findViewById(R.id.to_BigDecimal_btn);
        Button editData = findViewById(R.id.edit_data_btn);

        exclusionBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View view) {
                Gson gson = new GsonBuilder().setExclusionStrategies(new MyExclusionStrategy()).create();
                ObjectForExclusion obj = new ObjectForExclusion("first", "second", 25);
                String json = gson.toJson(obj);
                Toast.makeText(getApplicationContext(), json, Toast.LENGTH_SHORT).show();
            }
        });

        deserializeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new GsonBuilder().registerTypeAdapter(ObjectForDeserialize.class, new CustomConverter()).create();
                String json = "{\"name\":\"name\",\"any_map\":{\"a\":\"55\",\"b\":\"85\",\"c\":\"56\"}}";
                ObjectForDeserialize obbj = gson.fromJson(json, ObjectForDeserialize.class);
            }
        });

        toBigDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new GsonBuilder().registerTypeAdapter(ObjectForBigDecimal.class, new ConverterForBigDecimal()).create();
                String string = "{\"money_amount\":\"2444,88\"}";
                ObjectForBigDecimal obj = gson.fromJson(string, ObjectForBigDecimal.class);
            }
        });

        editData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new GsonBuilder().registerTypeAdapter(DateExample.class, new ConverterForDate()).create();
                DateExample date = new DateExample(new Date());
                String json = gson.toJson(date);
                Toast.makeText(getApplicationContext(), json, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
