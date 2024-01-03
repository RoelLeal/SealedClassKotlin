package com.sealedclass.sealedclass.model

data class GameModel(
    val title: String,
    val serialNumber: String,
    val error: GameError
)

sealed class GameError () {
    object Internet: GameError()
    object Peso: GameError()
    object Ejecuccion: GameError()
    object Archivo: GameError()
}