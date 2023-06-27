package example.imageviewer.model

import kotlinx.serialization.Serializable

@Serializable
data class PokemonApiResponse(val cards: List<Pokemon>)
