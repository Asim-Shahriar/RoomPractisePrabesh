package com.example.roompractiseprabesh;

import androidx.room.Insert;

public interface MyDao {

    @Insert
    public void addUser(User user);
}
