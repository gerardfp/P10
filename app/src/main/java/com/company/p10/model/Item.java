package com.company.p10.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import java.time.LocalDateTime;

@Entity
public class Item {
    @PrimaryKey (autoGenerate = true)
    public int id;

    public String name;
    public String date; // TODO: TypeConverter

    public Item(){}

    public Item(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @TypeConverter
    public static LocalDateTime toDate(String dateString) {
        if (dateString == null)           return null;

            return LocalDateTime.parse(dateString);

    }

    @TypeConverter
    public static String toDateString(LocalDateTime date) {
        if (date == null) return null;
        return date.toString();
    }
}
