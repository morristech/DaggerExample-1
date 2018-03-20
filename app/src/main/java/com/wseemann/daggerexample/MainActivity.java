package com.wseemann.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject StateHolder stateHolder;

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyComponent component = ((DaggerExampleApp) getApplication()).getMyComponent();
        component.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Count: " + stateHolder.getCount());
    }
}
