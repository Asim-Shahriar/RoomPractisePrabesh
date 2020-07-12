package com.example.roompractiseprabesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class AddUserFragment extends Fragment {

    private EditText id,name,email;
    private Button savebtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_add_user, container, false);
        id=v.findViewById(R.id.ed_id);
        name=v.findViewById(R.id.ed_name);
        email=v.findViewById(R.id.ed_email);
        savebtn=v.findViewById(R.id.btn_save_user);

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userid=Integer.parseInt(id.getText().toString());
                String username=name.getText().toString();
                String useremail=email.getText().toString();
            }
        });
        return  v;
    }
}