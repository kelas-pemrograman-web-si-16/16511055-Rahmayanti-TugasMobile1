package com.example.tugas1biodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnama, txtnpm, txtttl, txthobi, txtalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama =  (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama   : Rahmayanti");

        txtnpm =  (TextView) findViewById(R.id.txtnpm);
        txtnpm.setText("NPM     : 16411055");

        txtttl =  (TextView) findViewById(R.id.txtttl);
        txtttl.setText("TTL     : Palembang, 20 November 1997");

        txthobi =  (TextView) findViewById(R.id.txthobi);
        txthobi.setText("Hobi   : Membaca");
    }
}
