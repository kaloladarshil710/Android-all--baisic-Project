package com.example.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    private  static final String CHANNAL_ID = "My channal";
    private  static final int NOTIFICATION_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.icon,null);
        BitmapDrawable bitmapDrawable =(BitmapDrawable) drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                notification = new  Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.icon)
                    .setContentText("New Text")
                    .setSubText("New Message from Darshil")
                    .setChannelId(CHANNAL_ID)
                    .build();
                nm.createNotificationChannel(new NotificationChannel(CHANNAL_ID,"New Channal",NotificationManager.IMPORTANCE_HIGH));
        }else {
            notification = new  Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.icon)
                    .setContentText("New Text")
                    .setSubText("New Message from Darshil")
                    .build();

            nm.notify(NOTIFICATION_ID,notification);
        }


    }
}