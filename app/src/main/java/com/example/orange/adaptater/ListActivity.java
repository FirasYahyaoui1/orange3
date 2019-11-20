package com.example.orange.adaptater;

import android.os.Bundle;

import com.example.orange.R;
import com.example.orange.models.User;
import com.example.orange.retro.ApiUtil;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

      ApiUtil.getServiceClass().getAllUser().enqueue(new Callback<List<User>>() {
          @Override
          public void onResponse(Call<List<User>> call, Response<List<User>> response) {
              List<User>users=response.body();
          }

          @Override
          public void onFailure(Call<List<User>> call, Throwable t) {

          }
      });
    }
}
