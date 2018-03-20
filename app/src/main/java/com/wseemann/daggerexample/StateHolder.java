package com.wseemann.daggerexample;

/**
 * Created by wseemann on 3/18/18.
 */

public class StateHolder {

    private int count = 0;

    public StateHolder() {

    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

}
