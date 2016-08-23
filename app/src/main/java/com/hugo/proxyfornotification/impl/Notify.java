package com.hugo.proxyfornotification.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import com.hugo.proxyfornotification.R;

/**
 * Created by HugoXie on 16/8/12.
 *
 * Email: Hugo3641@gmail.com
 * GitHub: https://github.com/xcc3641
 * Info: 通知的抽象类
 */
public abstract class Notify {

    protected Context mContext;
    protected NotificationManager mManager;
    protected NotificationCompat.Builder mBuilder;
    protected Notification mNotification;

    public Notify(Context context) {
        mContext = context;
        mManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder = new NotificationCompat.Builder(mContext);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher)
            .setContentIntent(PendingIntent.getActivity(mContext, 0, new Intent(), PendingIntent.FLAG_UPDATE_CURRENT))
            .setFullScreenIntent(PendingIntent.getActivity(mContext, 0, new Intent(), PendingIntent.FLAG_UPDATE_CURRENT), false)
            .setContentTitle("提醒").setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS);
        mNotification = mBuilder.build();
    }

    public abstract void send();

    public abstract void cancel();

    public abstract void build();
}
