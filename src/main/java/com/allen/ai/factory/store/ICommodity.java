package com.allen.ai.factory.store;

import java.util.Map;

public interface ICommodity {

    void sendCommodity(String uId, String cId, String bizId, Map<String, String> extMap) throws Exception;
}
