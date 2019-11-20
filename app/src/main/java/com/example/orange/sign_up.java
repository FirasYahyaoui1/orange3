package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.orange.models.User;
import com.example.orange.retro.ApiUtil;


public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        findViewById(R.id.SignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Editemail=findViewById(R.id.Email);
                EditText EditfName=findViewById(R.id.FName);
                EditText EditlName=findViewById(R.id.LName);

                String email=Editemail.getText().toString();
                String fName=EditfName.getText().toString();
                String lName=EditlName.getText().toString();
                final User user=new User();
                user.setFirst_name(fName);
                user.setLast_name(lName);
                user.setEmail(email);
                ApiUtil.getServiceClass().addUser(user).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        User userResponse=response.body();
                        Toast.makeText(sign_up.this, "done with id user="+userResponse.getId(),
                                Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(sign_up.this,"Error",Toast.LENGTH_LONG).show();

                    }
                });
            }
        });


    }
}
