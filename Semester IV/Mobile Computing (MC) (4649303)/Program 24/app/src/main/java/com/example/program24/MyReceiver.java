package com.example.program24;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
 
public class MyReceiver extends BroadcastReceiver{
 
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
 
}