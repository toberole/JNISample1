package com.zhouwei.jnisample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhouwei.jnisample.java_jni.JNISample;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNISample jniSample = new JNISample();
        int res = jniSample.add(1, 3);
        Log.i("AAAA", "a+b = " + res);
    }
}
