package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.orange.retro.ApiUtil;

public class Lister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister);
        findViewById(R.id.btn_lister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiUtil.getServiceClass().
            }
        });
    }
}
