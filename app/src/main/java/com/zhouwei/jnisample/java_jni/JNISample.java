package com.zhouwei.jnisample.java_jni;

/**
 * Created by zhouwei on 2018/1/19.
 */

public class JNISample {
    static {
        System.loadLibrary("MyLibrary");
    }

    public native int add(int a, int b);
}
