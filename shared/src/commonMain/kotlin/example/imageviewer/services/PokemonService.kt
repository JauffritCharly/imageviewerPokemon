package example.imageviewer.services

import example.imageviewer.model.Pokemon
import example.imageviewer.model.PokemonApiResponse
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import io.ktor.client.call.body
import io.ktor.client.request.get


class PokemonService (){

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun getAll(): List<Pokemon>{
        val url = "https://api.pokemontcg.io/v1/cards"
        val response: PokemonApiResponse = httpClient.get(url).body()
        return response.cards
    }
}