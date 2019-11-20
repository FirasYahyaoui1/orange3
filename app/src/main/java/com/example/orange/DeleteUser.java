package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orange.models.User;
import com.example.orange.retro.ApiUtil;

public class DeleteUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);
        findViewById(R.id.Btn_Delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextDelId=findViewById(R.id.Delete_Id);
                String userId=editTextDelId.getText().toString();
                ApiUtil.getServiceClass().deleteUserById(Integer.parseInt((userId))).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        User userRes=response.body();
                        TextView del_info=findViewById(R.id.Delete_User);
                        del_info.setText("user del="+userRes.getFirst_name());
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                       // Toast.makeText(DeleteUser.this,"Error",Toast.LENGTH_LONG).show();

                    }
                });
            }
        });

    }
}
