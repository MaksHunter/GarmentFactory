package com.MCb.garmentfactory;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class EventDispatcher extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        DebugLog.Log(intent.getAction());
    }
}