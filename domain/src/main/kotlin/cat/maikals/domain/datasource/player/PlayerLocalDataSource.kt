package cat.maikals.domain.datasource.player

import cat.maikals.domain.entities.Player

interface PlayerLocalDataSource {
    fun getAllPlayers() : List<Player>
}