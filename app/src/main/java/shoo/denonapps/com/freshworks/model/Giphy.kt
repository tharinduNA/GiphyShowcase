package shoo.denonapps.com.freshworks.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "giphy")
data class Giphy(
    @ColumnInfo(name = "id") var id: String,
    @PrimaryKey(autoGenerate = true) var index: Int = 0
) : Serializable
