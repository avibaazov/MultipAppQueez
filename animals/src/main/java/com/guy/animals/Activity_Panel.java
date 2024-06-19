package com.guy.animals;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.guy.common.Activity_PanelBase;

public class Activity_Panel extends Activity_PanelBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerAnimals();
        super.onCreate(savedInstanceState);


    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        dataManagerBase = new DataManagerAnimals();
//    }
}