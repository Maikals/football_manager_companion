package cat.maikals.data.data_source.player

import cat.maikals.data.entities.mappers.toDomain
import cat.maikals.data.entities.realm_entities.PlayerRealmObject
import cat.maikals.data.persistence.RealmController
import cat.maikals.domain.datasource.player.PlayerLocalDataSource
import cat.maikals.domain.entities.Player

class PlayerLocalDataSourceImpl() : PlayerLocalDataSource {
    override fun getAllPlayers(): List<Player> =
        toDomain(RealmController.getInstance().where(PlayerRealmObject::class.java).findAll())
}