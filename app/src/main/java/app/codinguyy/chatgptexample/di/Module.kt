package app.codinguyy.shoppinghelper.di

import app.codinguyy.chatgptexample.FirstFragmentViewModel
import app.codinguyy.chatgptexample.repository.Repository
import app.codinguyy.chatgptexample.service.ServiceBuilder
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {
    viewModel { FirstFragmentViewModel(get()) }
}

val repositories = module {
    single { Repository(get()) }
    single { ServiceBuilder() }
}
