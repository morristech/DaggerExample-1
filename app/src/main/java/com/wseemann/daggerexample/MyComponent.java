package com.wseemann.daggerexample;

import android.app.Activity;
import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by wseemann on 3/18/18.
 */

@Singleton
@Component(modules = { StateHolderModule.class })
public interface MyComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        MyComponent build();
    }

    void inject(DaggerExampleApp app);
    void inject(MainActivity activity);
}