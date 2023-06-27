package example.imageviewer.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    var name: String,
    @SerialName("imageUrl")
    val imageUrl: String
)
