package com.example.tachiyomi

import android.app.Application
import com.example.tachiyomi.modul.appModule
import com.example.tachiyomi.modul.repositoryModule
import com.example.tachiyomi.modul.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(appModule)

        }
    }
}