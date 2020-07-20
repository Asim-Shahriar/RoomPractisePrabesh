package com.example.roompractiseprabesh;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface MyDao {

    @Insert
    public void addUser(User user);

    @Query("select * from users")
    public List<User> getUsers();
}
