package app.codinguyy.chatgptexample

import android.app.Application
import app.codinguyy.shoppinghelper.di.repositories
import app.codinguyy.shoppinghelper.di.viewModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ChatGPTApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@ChatGPTApplication)
            modules(repositories, viewModules)
        }
    }

}
