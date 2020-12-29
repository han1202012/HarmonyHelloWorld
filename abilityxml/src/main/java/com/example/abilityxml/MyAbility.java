package com.example.abilityxml;

import com.example.abilityxml.slice.MyAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MyAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //super.setMainRoute(MyAbilitySlice.class.getName());

        // 显示自定义的 mylayout.xml 布局文件
        super.setUIContent(ResourceTable.Layout_mylayout);
    }
}
