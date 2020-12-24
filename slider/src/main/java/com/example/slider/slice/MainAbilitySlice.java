package com.example.slider.slice;

import com.example.slider.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Slider;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取布局文件中的拖动条 Slider
        Slider slider = (Slider) findComponentById(ResourceTable.Id_slider);
        // 获取布局文件中的按钮 Button
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        // 获取布局文件中的文本 Text
        Text text = (Text) findComponentById(ResourceTable.Id_text);

        // 设置按钮点击事件
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                // 获取当前属性值
                int progress = slider.getProgress();
                text.setText("当前进度值 : " + progress);
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
