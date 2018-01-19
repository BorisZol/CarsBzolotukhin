package ru.luxoft.dev018.carsbzolotukhin.loadActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ru.luxoft.dev018.carsbzolotukhin.R;

/**
 * Created by bzolotukhin on 19.01.2018.
 */

public class LoadActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_carload);


    }



}
