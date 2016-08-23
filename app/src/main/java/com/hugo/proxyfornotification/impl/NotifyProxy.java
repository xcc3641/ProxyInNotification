package com.hugo.proxyfornotification.impl;

import android.content.Context;
import android.os.Build;

/**
 * Created by HugoXie on 16/8/23.
 *
 * Email: Hugo3641@gmail.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class NotifyProxy extends Notify {
    private Notify mNotify;

    public NotifyProxy(Context context) {
        super(context);
    }

    @Override
    public void send() {
        build();
        mNotify.send();
    }

    @Override
    public void cancel() {
        mNotify.cancel();
    }

    @Override
    public void build() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mNotify = new NotifyHeader(mContext, new NotifyNormal(mContext));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mNotify = new NotifyBig(mContext, new NotifyNormal(mContext));
        } else {
            mNotify = new NotifyNormal(mContext);
        }
    }
}
