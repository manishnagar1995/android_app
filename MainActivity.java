package com.example.pardeepatwal.finalalarm;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        b1=(Button) findViewById(R.id.bt1);
    }
    public void Click1(View v)
    {
        int time=Integer.parseInt(e1.getText().toString());
        Intent i=new Intent(MainActivity.this,Receiver.class);
        PendingIntent pi= PendingIntent.getBroadcast(getApplicationContext(),0,i,0);
        AlarmManager am= (AlarmManager) getSystemService(ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+time*1000,pi);
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("My Notification");
        builder.setContentText("My Notification Text");
        builder.setSmallIcon(R.mipmap.ic_launcher);

        builder.setContentIntent(pi);
        builder.setAutoCancel(true);

        nm.notify(0,builder.build());

    }
}
