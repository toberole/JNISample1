//
// Created by zhouwei11 on 2018/1/19.
//

#include "com_zhouwei_jnisample_java_jni_JNISample.h"

JNIEXPORT jint JNICALL Java_com_zhouwei_jnisample_java_1jni_JNISample_add(JNIEnv * env, jobject jobj, jint a, jint b)
{
    return a+b;
}