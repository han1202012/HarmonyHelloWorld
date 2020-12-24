package com.example.textfield.slice;

import com.example.textfield.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.TextField;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取布局文件中的 TextField 组件
        TextField textField = (TextField) findComponentById(ResourceTable.Id_textfield);

        // 设置默认显示的内容
        textField.setText("请输入手机号 : ");
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
