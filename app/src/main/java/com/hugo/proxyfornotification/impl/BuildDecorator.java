package com.hugo.proxyfornotification.impl;

import android.content.Context;

/**
 * Created by HugoXie on 16/8/16.
 *
 * Email: Hugo3641@gmail.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public abstract class BuildDecorator extends Notify {
    protected Notify mNotify;

    public BuildDecorator(Context context, Notify notify) {
        super(context);
        mNotify = notify;
    }

    @Override
    public void build() {
        mNotify.build();
    }
}
