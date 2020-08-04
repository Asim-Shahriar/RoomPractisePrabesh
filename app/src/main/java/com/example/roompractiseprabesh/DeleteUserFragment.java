package com.example.roompractiseprabesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DeleteUserFragment extends Fragment {

    private EditText deleteId;
    private Button deleteUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_delete_user, container, false);

        deleteId=view.findViewById(R.id.ed_delete);
        deleteUser=view.findViewById(R.id.btn_deleteUser);

        deleteUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(deleteId.getText().toString());
                User user=new User();
                user.setId(id);
                MainActivity.myAppDatabase.myDao().deleteUser(user);

                Toast.makeText(getActivity(),"User removed",Toast.LENGTH_SHORT).show();
                deleteId.setText(" ");
            }
        });
        return view;
    }
}