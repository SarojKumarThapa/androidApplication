package com.example.todoapplication.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface TodoDAO {
    @Insert
    void insert(ETodo eTodo);

    @Delete
    void deleteById(ETodo eTodo);

    @Query("select * from etodo where id =?")
    ETodo getTodoItemById(Integer id );

}

