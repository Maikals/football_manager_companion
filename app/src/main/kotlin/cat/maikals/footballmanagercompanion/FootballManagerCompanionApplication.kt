package cat.maikals.footballmanagercompanion

import android.app.Application
import cat.maikals.footballmanagercompanion.di.moduleList
import io.realm.Realm
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FootballManagerCompanionApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin()
        initializeRealm()
    }

    private fun initializeRealm() = Realm.init(this)

    private fun initializeKoin() =
        startKoin {
            androidContext(this@FootballManagerCompanionApplication)
            moduleList
        }
}