package com.example.progressbar.slice;

import com.example.progressbar.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.ProgressBar;
import ohos.agp.components.RoundProgressBar;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 获取 XML 布局中的 ProgressBar 按钮
        ProgressBar progressBar = (ProgressBar) findComponentById(ResourceTable.Id_progressbar);
        // 设置最大值最小值
        progressBar.setMaxValue(100);
        progressBar.setMinValue(0);
        // 设置当前进度
        progressBar.setProgressValue(20);
        // 设置第二进度值
        progressBar.setViceProgress(80);

        // 获取 XML 布局中的 RoundProgressBar 按钮
        RoundProgressBar roundProgressBar = (RoundProgressBar) findComponentById(ResourceTable.Id_roundprogressbar);
        // 设置最大值最小值
        roundProgressBar.setMaxValue(20);
        roundProgressBar.setMinValue(0);
        // 设置当前进度
        roundProgressBar.setProgressValue(10);
        // 设置第二进度
        roundProgressBar.setViceProgress(15);

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
