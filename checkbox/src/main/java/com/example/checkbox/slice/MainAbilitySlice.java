package com.example.checkbox.slice;

import com.example.checkbox.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.AbsButton;
import ohos.agp.components.Button;
import ohos.agp.components.Checkbox;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取文本组件
        Text text = (Text) findComponentById(ResourceTable.Id_text);

        // 获取 XML 布局中的 Checkbox 多选按钮
        Checkbox checkbox0 = (Checkbox) findComponentById(ResourceTable.Id_checkbox0);
        checkbox0.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean b) {
                // b 为 true 多选按钮选中 , false 取消选中
                if(b) {
                    text.setText("当前 多选按钮 0 选中状态 : 选中");
                }else{
                    text.setText("当前 多选按钮 0 选中状态 : 未选中");
                }
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
