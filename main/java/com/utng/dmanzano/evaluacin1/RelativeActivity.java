package com.utng.dmanzano.evaluacin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RelativeActivity extends AppCompatActivity {

    private TextView txtMsj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        txtMsj = (TextView)findViewById(R.id.txt_msj);


        Bundle bundle = this.getIntent().getExtras();


        txtMsj.setText( bundle.getString("Name")+", "+bundle.getString("Age")+", "+bundle.getString("Phone"));
    }
}
