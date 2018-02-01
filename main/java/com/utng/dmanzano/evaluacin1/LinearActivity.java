package com.utng.dmanzano.evaluacin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtAge;
    private EditText edtPhone;
    private Button btn_sumbmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        edtName =(EditText)findViewById(R.id.type_name);
        edtAge =(EditText)findViewById(R.id.type_age);
        edtPhone=(EditText)findViewById(R.id.type_phone);

        btn_sumbmit =(Button)findViewById(R.id.submit);

        btn_sumbmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(LinearActivity.this, RelativeActivity.class);

                Bundle b = new Bundle();
                b.putString("Name",edtName.getText().toString());
                b.putString("Age", edtAge.getText().toString());
                b.putString("Phone",edtPhone.getText().toString());

                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }
}
