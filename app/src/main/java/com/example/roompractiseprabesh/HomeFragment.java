package com.example.roompractiseprabesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment implements View.OnClickListener{

    private Button addbtn,btnreadUsers;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        addbtn=v.findViewById(R.id.btn_add);
        btnreadUsers=v.findViewById(R.id.btn_view_user);
        btnreadUsers.setOnClickListener(this);
        addbtn.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
      switch (v.getId()){
          case R.id.btn_add:
              MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).addToBackStack(null)
                      .commit();
              break;

          case R.id.btn_view_user:
              MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment()).addToBackStack(null)
                      .commit();
              break;
      }
    }
}