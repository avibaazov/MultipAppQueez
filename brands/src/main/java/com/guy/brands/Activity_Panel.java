package com.guy.brands;

import android.os.Bundle;

import com.guy.common.Activity_PanelBase;

public class Activity_Panel extends Activity_PanelBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerBrands();
        super.onCreate(savedInstanceState);


    }
}