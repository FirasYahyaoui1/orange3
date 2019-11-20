package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orange.models.User;
import com.example.orange.retro.ApiUtil;

import java.util.List;

public class Lister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister);
        findViewById(R.id.btn_lister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiUtil.getServiceClass().getAllUser().enqueue(new Callback<List<User>>() {
                    @Override
                    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                        List<User> users=response.body();
                        TextView textViewResult=findViewById(R.id.liste);
                        textViewResult.setText("List count = " + users.size()+
                                "First element = "+users.get(0).toString());

                    }

                    @Override
                    public void onFailure(Call<List<User>> call, Throwable t) {
                        Toast.makeText(Lister.this,"Error",Toast.LENGTH_LONG).show();

                }}
                );
            }
        });
    }
}
