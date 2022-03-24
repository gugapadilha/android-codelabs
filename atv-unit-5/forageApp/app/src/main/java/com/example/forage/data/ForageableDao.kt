package com.example.forage.data


import androidx.room.*
import com.example.forage.model.Forageable
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for database interaction.
 */
@Dao
interface ForageableDao {

    // TODO: implement a method to retrieve all Forageables from the database
    @Query("SELECT * from Forageable ORDER BY name ASC")
    fun getForageables(): Flow<List<Forageable>>

    // TODO: implement a method to retrieve a Forageable from the database by id
    @Query("SELECT * from Forageable WHERE id == :id")
    fun getForageable(id: Long): Flow<Forageable>

    // TODO: implement a method to insert a Forageable into the database
    //  (use OnConflictStrategy.REPLACE)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(foregeable: Forageable)

    // TODO: implement a method to update a Forageable that is already in the database
    @Update
    suspend fun update(forageable: Forageable)

    // TODO: implement a method to delete a Forageable from the database.
    @Update
    suspend fun delete(forageable: Forageable)
}