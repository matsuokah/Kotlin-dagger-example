package jp.matsuokah.kotlin_dagger_sample

import android.app.Application
import jp.matsuokah.kotlin_dagger_sample.di.ApplicationComponent
import jp.matsuokah.kotlin_dagger_sample.di.ApplicationModule
import jp.matsuokah.kotlin_dagger_sample.di.DaggerApplicationComponent

class SampleApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        initInjector()
        applicationComponent.inject(this)
    }

    fun initInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(ApplicationModule(this))
        .build()
    }
}
