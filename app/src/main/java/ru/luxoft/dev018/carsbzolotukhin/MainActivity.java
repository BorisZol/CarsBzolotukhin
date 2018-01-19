package ru.luxoft.dev018.carsbzolotukhin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.luxoft.dev018.carsbzolotukhin.loadActivity.LoadActivity;
import ru.luxoft.dev018.carsbzolotukhin.model.Cars;
import ru.luxoft.dev018.carsbzolotukhin.model.DummyCars;

public class MainActivity extends AppCompatActivity {
//TODO https://drive.google.com/file/d/1CcqmYr1VXQOOHo0pMJBs0-Rsb2SD4mHl/view?usp=sharing

    Cars cars = new DummyCars();  //TODO remowe Debug class DummyCars
    //Cars cars = new Cars();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        startActivity(new Intent(this, LoadActivity.class));
        finish();
    }


}
