package com.example.button.slice;

import com.example.button.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取 XML 布局中的 Button 按钮
        Button button = (Button) findComponentById(ResourceTable.Id_button);

        // 设置 Button 按钮点击事件
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
               // 修改 Button 按钮属性

                // 修改 Button 背景颜色
                ShapeElement shapeElement = new ShapeElement();
                // 设置红色背景
                shapeElement.setRgbColor(new RgbColor(0xFF, 0x00, 0x00));
                // 设置 组件 背景
                button.setBackground(shapeElement);

                // 设置文本
                button.setText("点你咋地");

                // 设置文本颜色
                button.setTextColor(Color.WHITE);

                // 设置文本大小
                button.setTextSize(180);
            }
        });

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
