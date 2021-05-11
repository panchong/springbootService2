package com.allen.ai.singleton;

//使用类的内部类(线程安全)
public class Singleton04 {
    private static class SingletonHolder{
        private static Singleton04 instance = new Singleton04();
    }
    private static Singleton04 instance;
    private void Singleton04(){

    }
    public static Singleton04 getInstance(){
        return SingletonHolder.instance;
    }
}
