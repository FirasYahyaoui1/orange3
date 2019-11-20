package com.example.orange.adaptater;

import android.view.View;
import android.widget.TextView;

import com.example.orange.R;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public TextView email ;
    public  TextView name ;
    public  UserViewHolder(View itemView){
        super((itemView));
        email=itemView.findViewById(R.id.Recycle_text1);
        name=itemView.findViewById(R.id.Recycle_text2);

    }
}
