package com.allen.ai.builder.matter;

import java.math.BigDecimal;

public interface Matter {

    /*
    * 场景
    * */
    String scene();

    /*
     * 品牌
     * */
    String brand();

    /*
     * 型号
     * */
    String model();

    /*
     * 报价
     * */
    BigDecimal price();

    /*
     * 描述
     * */
    String desc();
}
