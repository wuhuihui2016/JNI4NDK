#include "com_whh_jni4ndk_ndk_NDKTools.h"

JNIEXPORT jstring JNICALL Java_com_whh_jni4ndk_ndk_NDKTools_getStringFromNDK
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"Hellow World，这是慧慧童鞋的NDK的第一行代码");
  }