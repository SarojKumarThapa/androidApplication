package com.example.todoapplication.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class ETodo {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)

    Integer id;

    @ColumnInfo(name = "title")
    String title;

    @ColumnInfo(name = "description")
    String description;

    @ColumnInfo(name = "priority")
    Integer priority;

    @ColumnInfo(name = "task_date")
    Date taskDate;

    @ColumnInfo(name = "is_complete")
    Boolean isComplete;


}
