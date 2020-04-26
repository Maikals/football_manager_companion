package cat.maikals.data.entities.mappers

import cat.maikals.data.entities.realm_entities.PlayerRealmObject
import cat.maikals.domain.entities.Player
import cat.maikals.domain.entities.PositionsEnum
import io.realm.RealmResults

fun toDomain(realmResults: RealmResults<PlayerRealmObject>) : List<Player> =
    realmResults.map(::toDomain)

fun toDomain(it: PlayerRealmObject) =
    Player(it.id, it.name, it.positions.map {
        PositionsEnum.valueOf(it)
    }, it.dorsal)