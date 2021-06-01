package shoo.denonapps.com.freshworks.database

import androidx.room.Database
import androidx.room.RoomDatabase
import shoo.denonapps.com.freshworks.model.Giphy
import shoo.denonapps.com.freshworks.repository.GiphyDao

@Database(entities = [Giphy::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun giphyDao(): GiphyDao
}