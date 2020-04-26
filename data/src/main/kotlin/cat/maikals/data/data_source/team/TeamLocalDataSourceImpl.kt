package cat.maikals.data.data_source.team

import cat.maikals.data.entities.mappers.toDomain
import cat.maikals.data.entities.realm_entities.TeamRealmObject
import cat.maikals.data.persistence.RealmController
import cat.maikals.domain.datasource.team.TeamLocalDataSource
import cat.maikals.domain.entities.Team

class TeamLocalDataSourceImpl() : TeamLocalDataSource {
    override fun getAllTeams(): List<Team> =
        toDomain(RealmController.getInstance().where(TeamRealmObject::class.java).findAll())
}