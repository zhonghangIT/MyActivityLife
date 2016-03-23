package com.uniquedu.myactivitylife;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //添加新的注释
    private static final String TAG="Activity的生命周期";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"运行到onCreate()方法");
        //Activity横竖屏切换时的生命周期，Activity默认情况下 onPause-->onStop-->onDestory-->onCreate-->onStart-->onResume
        //在Manifest.xml中声明activity的android:configChanges="keyboardHidden|orientation|screenSize" 横竖屏切换时只调用onConfigurationChanged
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG,"横竖屏切换调用onConfigurationChanged");
        switch (getResources().getConfiguration().orientation){
            case Configuration.ORIENTATION_LANDSCAPE:
                Log.d(TAG,"当前屏幕方向为横屏");
                break;
            case Configuration.ORIENTATION_PORTRAIT:
                Log.d(TAG,"当前屏幕方向为竖屏");
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"运行到onStart()方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"运行到onResume()方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"运行到onPause()方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"运行到onStop()方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"运行到onDestroy()方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"运行到onRestart()方法");
    }
}
