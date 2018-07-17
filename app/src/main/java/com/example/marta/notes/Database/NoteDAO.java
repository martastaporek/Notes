package com.example.marta.notes.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.marta.notes.model.Note;

import java.util.List;

@Dao
public interface NoteDAO {

    @Query("SELECT * FROM notes")
    List<Note> getAll();

    @Query("SELECT * FROM notes WHERE id = (:id)")
    Note findById(int id);

    @Insert
    void insert(Note note);

    @Delete
    void delete(Note note);
}