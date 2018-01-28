package com.androidpropertyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;

import java.util.ArrayList;
import java.util.Arrays;

public class NativeActivity extends ReactActivity {

    Button btnGoTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);
        btnGoTo=(Button) findViewById(R.id.button);
        btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NativeActivity.this, MainActivity.class));
            }
        });

    }
}


