package cat.maikals.domain.entities

import java.util.UUID

data class Team(
    val id: String,
    val name: String,
    val players: List<Player>
)
