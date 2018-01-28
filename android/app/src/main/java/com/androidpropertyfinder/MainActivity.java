package com.androidpropertyfinder;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "AndroidPropertyFinder";
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName()) {
            @Override
            protected Bundle getLaunchOptions() {
                Bundle initialProperties = new Bundle();
                ArrayList<String> imageList = new ArrayList<String>(Arrays.asList(
                        "http://lorempixel.com/400/200/",
                        "http://lorempixel.com/400/200/"
                ));
                initialProperties.putStringArrayList("images", imageList);
                return initialProperties;
            }
        };
    }
}
