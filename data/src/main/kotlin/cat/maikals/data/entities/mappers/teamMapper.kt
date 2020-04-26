package cat.maikals.data.entities.mappers

import cat.maikals.data.entities.realm_entities.TeamRealmObject
import cat.maikals.domain.entities.Team
import io.realm.RealmResults

fun toDomain(results: RealmResults<TeamRealmObject>): List<Team> =
    results.map(::toDomain)

fun toDomain(it: TeamRealmObject) =
    Team(it.id, it.name, it.players.map { toDomain(it) })