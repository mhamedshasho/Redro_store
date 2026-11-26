package com.redro.store;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(RedroDownloadsPlugin.class);
        super.onCreate(savedInstanceState);
    }
}