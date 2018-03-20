package com.wseemann.daggerexample;

import android.app.Application;

import javax.inject.Inject;

/**
 * Created by wseemann on 3/18/18.
 */

public class DaggerExampleApp extends Application {

    private MyComponent component;

    @Inject
    StateHolder stateHolder;

    public void onCreate() {
        super.onCreate();

        component = DaggerMyComponent.builder().application(this).build();
        component.inject(this);

        stateHolder.increment();
    }

    public MyComponent getMyComponent() {
        return component;
    }
}
