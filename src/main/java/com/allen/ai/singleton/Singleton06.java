package com.allen.ai.singleton;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

//CAS「AtomicReference」(线程安全)
public class Singleton06 {
    private static final AtomicReference<Singleton06> INSTANCE = new AtomicReference<Singleton06>();

    private AtomicInteger atomicInteger = new AtomicInteger();

    private static Singleton06 instance;

    private void Singleton06(){

    }

    public static final Singleton06 getInstance(){
        for(;;){
            Singleton06 instance = INSTANCE.get();
            if(null!=instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton06());
            return INSTANCE.get();
        }
    }
}
