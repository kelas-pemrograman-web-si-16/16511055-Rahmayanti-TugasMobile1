package com.example.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnama;
    TextView txtnpm;
    EditText edtNama, edtNPM;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnpm = (TextView) findViewById(R.id.txtnpm);

        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNPM = (EditText) findViewById(R.id.edtNPM);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = edtNama.getText().toString();
                String npm = edtNPM.getText().toString();

                txtnama.setText("");
                txtnpm.setText("");

            }
        });

    }

    }
