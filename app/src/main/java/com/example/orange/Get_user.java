package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.orange.models.User;
import com.example.orange.retro.ApiUtil;

public class Get_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_user);
        findViewById(R.id.Btn_Get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextIdUser=findViewById(R.id.editId);
                String userId=editTextIdUser.getText().toString();
                ApiUtil.getServiceClass().getUserById(Integer.parseInt(userId)).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        TextView textViewinfo=findViewById(R.id.TextViewUSERINFO);
                        User userResp=response.body();
                        textViewinfo.setText(userResp.toString());
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                    }
                });
            }
        });
    }
}
