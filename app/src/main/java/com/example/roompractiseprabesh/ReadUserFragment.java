package com.example.roompractiseprabesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ReadUserFragment extends Fragment {

    private TextView txtInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_read_user, container, false);
        txtInfo=v.findViewById(R.id.txt_display_info);

        List<User> users=MainActivity.myAppDatabase.myDao().getUsers();

        String info="";
        for(User user:users){

            int id=user.getId();
            String name=user.getName();
            String email=user.getEmail();
            info=info+"\n\n"+"Id :"+id+"\n Name :"+name+"\n"+"Email :"+email;
        }
        txtInfo.setText(info);

        return v;
    }
}