package com.example.abilitycode;

import com.example.abilitycode.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.agp.utils.TextAlignment;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //super.setMainRoute(MainAbilitySlice.class.getName());

        // 使用代码生成 UI 布局与组件

        // 创建线性布局, 传入当前界面 Ability 对象
        DirectionalLayout directionalLayout = new DirectionalLayout(this);
        // 设置水平方向
        directionalLayout.setOrientation(Component.HORIZONTAL);

        // 配置上述线性布局
        // 创建布局配置对象 , DirectionalLayout.LayoutConfig , 构造函数中传入宽高设置
        DirectionalLayout.LayoutConfig layoutConfig = new DirectionalLayout.LayoutConfig(
                        DirectionalLayout.LayoutConfig.MATCH_PARENT,
                        DirectionalLayout.LayoutConfig.MATCH_PARENT);
        // 将布局配置对象设置给布局对象
        directionalLayout.setLayoutConfig(layoutConfig);

        // 设置布局背景颜色
        // 创建背景元素
        ShapeElement shapeElement = new ShapeElement();
        // 设置绿色
        shapeElement.setRgbColor(new RgbColor(0x00, 0xFF, 0x00));
        // 将背景设置给布局
        directionalLayout.setBackground(shapeElement);


        // 创建 Text 文本组件
        Text text = new Text(this);

        // 创建布局配置对象 , DirectionalLayout.LayoutConfig , 构造函数中传入宽高设置 , 这里设置成 800 x 800
        DirectionalLayout.LayoutConfig textLayoutConfig = new DirectionalLayout.LayoutConfig(
                800, 800);
        // 将布局配置对象设置给布局对象
        text.setLayoutConfig(textLayoutConfig);

        // 设置组件背景颜色
        // 创建背景元素
        ShapeElement textShapeElement = new ShapeElement();
        // 设置绿色
        textShapeElement.setRgbColor(new RgbColor(0xFF, 0xFF, 0xFF));
        // 设置给 Text 组件
        text.setBackground(textShapeElement);

        // 设置文字显示
        // 设置文字颜色
        text.setTextColor(Color.RED);
        // 设置文字大小
        text.setTextSize(50);
        // 设置显示的文本
        text.setText("代码创建的 Text 组件");
        // 设置对齐方式 , 居中
        text.setTextAlignment(TextAlignment.CENTER);

        // 将组件添加到布局中
        directionalLayout.addComponent(text);

        // Ability 显示上述创建的布局
        super.setUIContent(directionalLayout);

    }
}
