package com.hussein.plugins

import com.hussein.models.TicTacTocGame
import com.hussein.socket
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TicTacTocGame) {
    routing {
        socket(game)
    }
}
