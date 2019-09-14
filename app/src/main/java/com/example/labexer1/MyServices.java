package com.example.labexer1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

class MyService extends IntentService {

    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 10; i++) {
            Log.d("MyService", " Hi " + i);
        }
    }
}
