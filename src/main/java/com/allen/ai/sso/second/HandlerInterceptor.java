package com.allen.ai.sso.second;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
