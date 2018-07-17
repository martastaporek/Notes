package com.example.marta.notes.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.marta.notes.model.Note;

import java.io.File;


@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract NoteDAO noteDao();
    private final String DATABASE_NAME = "notes";

    private static boolean doesDatabaseExist(Context context, String dbName) {
        File dbFile = context.getDatabasePath(dbName);
            return dbFile.exists();
    }
}

