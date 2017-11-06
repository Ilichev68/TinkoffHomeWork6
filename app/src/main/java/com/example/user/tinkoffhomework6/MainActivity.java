package com.example.user.tinkoffhomework6;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exclusionBtn = findViewById(R.id.ex_btn);

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
    }
}
