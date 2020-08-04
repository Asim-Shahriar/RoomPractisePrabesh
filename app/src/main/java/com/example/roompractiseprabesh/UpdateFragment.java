package com.example.roompractiseprabesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class UpdateFragment extends Fragment {

    private EditText userId,userName,userEmail;
    private Button updateUserBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_update, container, false);

        userId=v.findViewById(R.id.id_update);
        userName=v.findViewById(R.id.name_update);
        userEmail=v.findViewById(R.id.email_update);
        updateUserBtn=v.findViewById(R.id.btn_update);

        updateUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              int id=Integer.parseInt(userId.getText().toString());
              String name=userName.getText().toString();
              String email=userEmail.getText().toString();

              User user= new User();
              user.setId(id);
              user.setName(name);
              user.setEmail(email);

              MainActivity.myAppDatabase.myDao().updateUser(user);
              Toast.makeText(getActivity(),"Update user done",Toast.LENGTH_SHORT).show();

              userId.setText("");
              userName.setText("");
              userEmail.setText("");
            }
        });

        return v;
    }
}