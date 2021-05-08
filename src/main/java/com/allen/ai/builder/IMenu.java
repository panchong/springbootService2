package com.allen.ai.builder;

import com.allen.ai.builder.matter.Matter;

public interface IMenu {

    IMenu appendCeiling(Matter matter);

    IMenu appendCoat(Matter matter);

    IMenu appendFloor(Matter matter);

    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
