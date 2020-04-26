package cat.maikals.domain.entities

data class Player(
    val id: String,
    val name: String,
    val positionsList: List<PositionsEnum>,
    val dorsal: Int
)
