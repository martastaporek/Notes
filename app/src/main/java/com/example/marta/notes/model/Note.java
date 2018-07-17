package com.example.marta.notes.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;


    @ColumnInfo(name = "data")
    private String data;

    public Note(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }


    public String getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }


}

