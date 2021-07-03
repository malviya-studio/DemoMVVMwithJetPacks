package com.abc.demomvvm.model.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "quote")
public class TableQuote {
       @PrimaryKey(autoGenerate = true)
       @NonNull
       public int id;
       @NonNull
       @ColumnInfo(name = "text")
       public String text;
       @NonNull
       @ColumnInfo(name = "author")
       public String author;
}
