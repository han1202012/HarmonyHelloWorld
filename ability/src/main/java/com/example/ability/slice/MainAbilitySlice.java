package com.example.ability.slice;

import com.example.ability.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

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

                // 初始化传递的 Intent 意图对象
                Intent intent = new Intent();
                // 设置跳转的目标 Page Ability 的 action 标识
                intent.setAction("ability.intent.MainAbility2");
                // 设置传递的数据
                intent.setParam("DATA", 888);

                // 跳转到目标 Page Ability
                startAbility(intent);
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
