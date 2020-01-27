package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirst, etsecond;
    Button btnadd, btnsubtract, btndivide;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        btnadd=findViewById(R.id.btnadd);
        btndivide=findViewById(R.id.btndivide);
        btnsubtract=findViewById(R.id.btnsubtract);
        tvresult=findViewById(R.id.tvresult);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.setText(etfirst.getText().toString());
            }
        });
    }
}
