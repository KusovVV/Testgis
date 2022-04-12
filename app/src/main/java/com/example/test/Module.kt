package com.example.test

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        MainViewModel(
            importString = get(),
            service = get()
        )
    }

    single { "sddsf from Koin" }

    factory<HelloService> { HelloServiceImpl(get()) }

    single { HelloMessageData() }
}