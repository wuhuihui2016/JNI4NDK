package com.whh.jni4ndk.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.whh.jni4ndk.R;
import com.whh.jni4ndk.ndk.NDKTools;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = NDKTools.getStringFromNDK();
        ((TextView) findViewById(R.id.tv)).setText(text);
    }
}
