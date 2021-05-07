package com.allen.ai.sso.first;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
