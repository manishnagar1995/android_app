package com.example.pardeepatwal.finalalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Pardeep Atwal on 24-04-2018.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarm........",Toast.LENGTH_SHORT).show();
    }
}
