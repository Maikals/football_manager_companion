package cat.maikals.footballmanagercompanion

import android.app.Application
import cat.maikals.footballmanagercompanion.di.moduleList
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FootballManagerCompanionApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FootballManagerCompanionApplication)
            moduleList
        }
    }
}