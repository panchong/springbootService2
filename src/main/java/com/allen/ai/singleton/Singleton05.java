package com.allen.ai.singleton;

//双重锁校验(线程安全)
//双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。
public class Singleton05 {
    private static volatile Singleton05 instance;

    private void Singleton05(){

    }

    private static Singleton05 getInstance(){

        if(null!=instance){
            return instance;
        }
        synchronized (Singleton05.class){
            if(null==instance){
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
