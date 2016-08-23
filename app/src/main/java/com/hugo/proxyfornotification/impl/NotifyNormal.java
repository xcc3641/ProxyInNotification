package com.hugo.proxyfornotification.impl;

import android.content.Context;
import android.widget.RemoteViews;
import com.hugo.proxyfornotification.R;

/**
 * Created by HugoXie on 16/8/23.
 *
 * Email: Hugo3641@gmail.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class NotifyNormal extends Notify {

    public NotifyNormal(Context context) {
        super(context);
    }

    @Override
    public void send() {
        mManager.notify(0, mNotification);
    }

    @Override
    public void cancel() {

    }

    @Override
    public void build() {
        mNotification.contentView = new RemoteViews(mContext.getPackageName(), R.layout.notify_normal);
    }
}
