package com.example.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "my_channel";
    private static final int NOTIFICATION_ID = 100;
    private static final int REQ_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.icon, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap largeIcon = bitmapDrawable.getBitmap();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;

        Intent iNotify = new Intent(getApplicationContext(), MainActivity.class);
        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pi = PendingIntent.getActivity(this, REQ_CODE, iNotify, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        // Big picture style
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle()
                .bigPicture(((BitmapDrawable) (ResourcesCompat.getDrawable(getResources(), R.drawable.icon, null))).getBitmap())
                .bigLargeIcon(largeIcon)
                .setBigContentTitle("Image sent by Darshil")
                .setSummaryText("Image Message");



        // inbox style
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle()
                .addLine("A")
                .addLine("B")
                .addLine("C")
                .addLine("A")
                .addLine("B")
                .addLine("C")
                .addLine("A")
                .addLine("B")
                .addLine("C")
                .addLine("A")
                .addLine("B")
                .addLine("C")
                .setBigContentTitle("Full Message")
                .setSummaryText("Message from Darshil");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Darshil Kalola", NotificationManager.IMPORTANCE_HIGH);
            nm.createNotificationChannel(channel);

            notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.icon)
                    .setContentText("New Message")
                    .setSubText("New Message from RAMAN")
                    .setOngoing(false)
                    .setStyle(inboxStyle)
                    .setContentIntent(pi)
                    .build();
        } else {
            notification = new NotificationCompat.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.icon)
                    .setContentText("New Message")
                    .setSubText("New Message from RAMAN")
                    .setStyle(inboxStyle)
                    .setContentIntent(pi)
                    .setOngoing(false)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .build();
        }
        nm.notify(NOTIFICATION_ID, notification);
    }
}




































//package com.example.notifications;
//
//
//import android.app.Notification;
//import android.app.NotificationChannel;
//import android.app.NotificationManager;
//import android.graphics.Bitmap;
//import android.graphics.drawable.BitmapDrawable;
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.content.res.ResourcesCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    private static final String CHANNAL_ID ="My Channal";
//    private static final int NOTIFICATION_ID =100;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.icon,null);
//
//        BitmapDrawable  bitmapDrawable = (BitmapDrawable) drawable;
//
//        Bitmap  largeIcon = bitmapDrawable.getBitmap();
//
//
//        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//
//        Notification notification;
//
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            notification = new Notification.Builder(this)
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.icon)
//                    .setContentText("N  ew Message")
//                    .setSubText("New Message from RAMAN")
//                    .setChannelId(CHANNAL_ID).build();
//
//            nm.createNotificationChannel(new NotificationChannel(CHANNAL_ID,"522524525252659",NotificationManager.IMPORTANCE_HIGH));
//        }else {
//            notification = new Notification.Builder(this)
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.icon)
//                    .setContentText("New Message")
//                    .setSubText("New Message from RAMAN").build();
//        }
//        nm.notify(NOTIFICATION_ID,notification);
//    }
//
//}
