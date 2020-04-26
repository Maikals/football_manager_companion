package cat.maikals.domain.datasource.team

import cat.maikals.domain.entities.Team

interface TeamLocalDataSource {
    fun getAllTeams() : List<Team>
}