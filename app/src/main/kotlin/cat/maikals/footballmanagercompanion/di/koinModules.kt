package cat.maikals.footballmanagercompanion.di

import cat.maikals.data.data_source.player.PlayerLocalDataSourceImpl
import cat.maikals.domain.datasource.player.PlayerLocalDataSource
import org.koin.dsl.module

val viewModelModules = module {

}

val useCaseModule = module {

}

val repositoryModule = module {

}

val dataSourceModule = module {
    single<PlayerLocalDataSource> { PlayerLocalDataSourceImpl() }
}

val moduleList = listOf(viewModelModules, useCaseModule, repositoryModule)

