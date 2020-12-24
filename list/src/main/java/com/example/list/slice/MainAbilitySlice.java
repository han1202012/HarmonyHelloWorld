package com.example.list.slice;

import com.example.list.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;

import java.util.ArrayList;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取布局文件中的 ListContainer 列表
        ListContainer listContainer = (ListContainer) findComponentById(ResourceTable.Id_listContainer);

        // 构造数据源
        ArrayList<DataItem> items = new ArrayList<>();
        items.add(new DataItem("Tom"));
        items.add(new DataItem("Jerry"));
        items.add(new DataItem("Trump"));

        // 为列表设置数据源
        listContainer.setItemProvider(new MyRecycleItemProvider(items, this));

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

/**
 * 代表每个列表项数据
 */
class DataItem{
    /**
     * 列表项字符串
     */
    public String text;

    /**
     * 构造函数初始化列表项
     * @param text
     */
    public DataItem(String text) {
        this.text = text;
    }
}

/**
 * 数据源
 */
class MyRecycleItemProvider extends RecycleItemProvider{

    /**
     * 数据
     */
    private ArrayList<DataItem> items;

    /**
     * 当前显示列表的界面
     */
    private AbilitySlice abilitySlice;

    public MyRecycleItemProvider(ArrayList<DataItem> items, AbilitySlice abilitySlice) {
        this.items = items;
        this.abilitySlice = abilitySlice;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Component getComponent(int i, Component component, ComponentContainer componentContainer) {
        Component ret = null;
        if (component == null){
            // 创建当前文本组件
            Text text = new Text(componentContainer.getContext());
            // 设置宽高
            text.setWidth(StackLayout.LayoutConfig.MATCH_PARENT);
            text.setHeight(StackLayout.LayoutConfig.MATCH_CONTENT);
            // 设置文本
            text.setText(items.get(i).text);
            // 设置文本大小
            text.setTextSize(100);
            ret = text;
        }else{
            ret = component;
        }

        return ret;
    }
}
