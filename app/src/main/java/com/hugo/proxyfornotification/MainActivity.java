package com.hugo.proxyfornotification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.hugo.proxyfornotification.impl.NotifyProxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSend(View view) {
        //NotifyNormal normal = new NotifyNormal(this);
        //BuildDecorator big = new NotifyBig(this,normal);
        ////big.send();
        //BuildDecorator head = new NotifyHeader(this,normal);
        //head.send();

        NotifyProxy proxy = new NotifyProxy(this);
        proxy.send();
    }
}
