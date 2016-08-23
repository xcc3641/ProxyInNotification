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
public class NotifyBig extends BuildDecorator {

    public NotifyBig(Context context, Notify notify) {
        super(context, notify);
    }

    @Override
    public void send() {
        build();
        mManager.notify(0, mNotification);
    }

    @Override
    public void cancel() {
        mManager.cancel(0);
    }

    @Override
    public void build() {
        super.build();
        mNotification.bigContentView = new RemoteViews(mContext.getPackageName(), R.layout.notify_big);
    }
}
