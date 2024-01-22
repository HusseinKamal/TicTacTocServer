package com.hussein

import com.hussein.models.TicTacTocGame
import com.hussein.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val game =TicTacTocGame()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}
