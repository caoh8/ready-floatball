package com.kugou.fioatball2.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.kugou.fioatball2.manager.ViewManager;

public class StartFloatBallService extends Service {
    private static String TAG = "StartFloatBallService";

    public StartFloatBallService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
        ViewManager manager = ViewManager.getInstance(this);
        manager.showFloatBall();
        super.onCreate();
    }

}