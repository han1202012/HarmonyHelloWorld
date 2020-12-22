package com.example.text.slice;

import com.example.text.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取布局中的组件
        Text text = (Text) findComponentById(ResourceTable.Id_text_helloworld2);
        // 使用代码设置文本
        text.setText("Hello In Java");
        // 使用代码设置文字大小
        text.setTextSize(150);
        // 使用代码设置文字颜色
        text.setTextColor(Color.RED);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
