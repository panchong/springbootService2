package com.allen.ai.sso.second;

public class SsoInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return false;
    }
}
