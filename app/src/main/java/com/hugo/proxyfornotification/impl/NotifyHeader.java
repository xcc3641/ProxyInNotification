package com.hugo.proxyfornotification.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.hugo.proxyfornotification.R;

/**
 * Created by HugoXie on 16/8/23.
 *
 * Email: Hugo3641@gmail.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class NotifyHeader extends NotifyBig {

    public NotifyHeader(Context context, Notify notify) {
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

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void build() {
        super.build();
        mNotification.headsUpContentView = new RemoteViews(mContext.getPackageName(), R.layout.notify_normal);
    }
}
