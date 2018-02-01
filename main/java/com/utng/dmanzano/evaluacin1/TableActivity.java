package com.utng.dmanzano.evaluacin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, GridActivity.class));
    }
    public void nextActivity2(View view) {
        startActivity(new Intent(this, LinearActivity.class));
    }
}
