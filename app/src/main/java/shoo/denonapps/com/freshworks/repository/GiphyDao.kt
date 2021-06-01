package shoo.denonapps.com.freshworks.repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import shoo.denonapps.com.freshworks.model.Giphy

@Dao
interface GiphyDao {

    @Query("select * from giphy")
    fun findAll(): LiveData<List<Giphy?>?>

    @Insert(onConflict = REPLACE)
    suspend fun addToFavourite(giphy: Giphy)

    @Query("delete from giphy WHERE id = :id")
    suspend fun deleteById(id: String)

}
