package com.allen.ai.afactory.factory.impl;

import com.allen.ai.afactory.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {

    //private IIR iir = new IIR();

    @Override
    public String get(String key) {
        //return iir.get("");
        return null;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {

    }

    @Override
    public void del(String key) {

    }
}
