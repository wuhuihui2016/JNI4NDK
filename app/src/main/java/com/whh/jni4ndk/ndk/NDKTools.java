package com.whh.jni4ndk.ndk;

/**
 * Created by wuhuihui on 2019/6/2.
 */

public class NDKTools {
    static {
        System.loadLibrary("jni4ndk-jni");
    }

    public static native String getStringFromNDK();
}
