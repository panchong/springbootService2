package com.allen.ai.sso.first;

public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(String request, String response, Object handler) {

        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }
}
