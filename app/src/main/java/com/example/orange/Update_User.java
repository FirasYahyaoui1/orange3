package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.orange.R;
import com.example.orange.models.User;
import com.example.orange.retro.ApiUtil;

public class Update_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__user);
        findViewById(R.id.btn_get_user_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=findViewById(R.id.put_Id);
                 String userId=editText.getText().toString();
                ApiUtil.getServiceClass().getUserById(Integer.parseInt(userId)).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        EditText editText1=findViewById(R.id.get_fName);
                        EditText editText2=findViewById(R.id.get_lName);
                        EditText editText3=findViewById(R.id.get_mail);
                       /* String fName=editText1.getText().toString();
                        String lName=editText2.getText().toString();
                        String mail=editText3.getText().toString();*/
                        User userResp=response.body();
                        editText1.setText(userResp.getFirst_name());
                        editText2.setText(userResp.getLast_name());
                        editText3.setText(userResp.getEmail());


                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                    //    Toast.makeText(Update_User.this,"Error",Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
       findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               EditText editText1=findViewById(R.id.get_fName);
               EditText editText2=findViewById(R.id.get_lName);
               EditText editText3=findViewById(R.id.get_mail);
               EditText editText=findViewById(R.id.put_Id);
               String userId=editText.getText().toString();
               ApiUtil.getServiceClass().updateUser(Integer.parseInt(userId),Integer.parseInt(editText.getText().toString()),editText3.getText().toString(),
                       editText1.getText().toString(),
                       editText2.getText().toString()
                       ,12,
                       "fohfijqoi","fkllls").enqueue(new Callback<User>() {
                   @Override
                   public void onResponse(Call<User> call, Response<User> response) {
                       Toast.makeText(Update_User.this,"Update Succeful",Toast.LENGTH_LONG).show();
                   }

                   @Override
                   public void onFailure(Call<User> call, Throwable t) {

                   }
               });


           }
       });
    }
}
