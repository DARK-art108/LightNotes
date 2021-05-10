package com.example.lightnotes.dao

import androidx.room.*
import com.example.lightnotes.entities.Notes

//Create Data Access Objects for DB Queries

@Dao
interface NotesDao {
    @get : Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(note:Notes)

    @Delete
    fun deleteNote(note: Notes)
}