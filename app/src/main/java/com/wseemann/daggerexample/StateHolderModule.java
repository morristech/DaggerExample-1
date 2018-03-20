package com.wseemann.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wseemann on 3/18/18.
 */

@Module()
class StateHolderModule {
    @Provides
    @Singleton
    StateHolder provideStateHolder() {
        return new StateHolder();
    }
}