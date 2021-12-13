package com.example.ir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Integer frequency = 38000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.TRANSMIT_IR) == PackageManager.PERMISSION_GRANTED)
        {
            Button sp_inc = findViewById(R.id.sp_inc);
            sp_inc.setOnClickListener(this);
            Button sp_dec = findViewById(R.id.sp_dec);
            sp_dec.setOnClickListener(this);
            Button off = findViewById(R.id.off);
            off.setOnClickListener(this);
            Button on = findViewById(R.id.on);
            on.setOnClickListener(this);
            Button red = findViewById(R.id.red);
            red.setOnClickListener(this);
            Button grn = findViewById(R.id.grn);
            grn.setOnClickListener(this);
            Button blu = findViewById(R.id.blu);
            blu.setOnClickListener(this);
            Button wht = findViewById(R.id.wht);
            wht.setOnClickListener(this);
            Button c1 = findViewById(R.id.c1);
            c1.setOnClickListener(this);
            Button c2 = findViewById(R.id.c2);
            c2.setOnClickListener(this);
            Button c3 = findViewById(R.id.c3);
            c3.setOnClickListener(this);
            Button fls = findViewById(R.id.fls);
            fls.setOnClickListener(this);
            Button c4 = findViewById(R.id.c4);
            c4.setOnClickListener(this);
            Button c5 = findViewById(R.id.c5);
            c5.setOnClickListener(this);
            Button c6 = findViewById(R.id.c6);
            c6.setOnClickListener(this);
            Button stro = findViewById(R.id.str);
            stro.setOnClickListener(this);
            Button c7 = findViewById(R.id.c7);
            c7.setOnClickListener(this);
            Button c8 = findViewById(R.id.c8);
            c8.setOnClickListener(this);
            Button c9 = findViewById(R.id.c9);
            c9.setOnClickListener(this);
            Button fad = findViewById(R.id.fad);
            fad.setOnClickListener(this);
            Button c10 = findViewById(R.id.c10);
            c10.setOnClickListener(this);
            Button c11 = findViewById(R.id.c11);
            c11.setOnClickListener(this);
            Button c12 = findViewById(R.id.c12);
            c12.setOnClickListener(this);
            Button smth = findViewById(R.id.smt);
            smth.setOnClickListener(this);


        }
        else{
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.TRANSMIT_IR},0);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {

        if (requestCode == 0) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_DENIED) {
                Toast test = Toast.makeText(getApplicationContext(), "Grant Permission", Toast.LENGTH_SHORT);
                test.show();
            }
        }
    }


    public void onClick(View view) {
        ConsumerIrManager irman = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);
        if(!irman.hasIrEmitter()){
            Toast test = Toast.makeText(getApplicationContext(), "Device Don't have IR Blaster", Toast.LENGTH_SHORT);
            test.show();
        }
        switch (view.getId()){
            case R.id.sp_inc: {
                irman.transmit(frequency, but.sp_inc);
                break;
            }
            case R.id.sp_dec: {
                irman.transmit(frequency, but.sp_dec);
                break;
            }
            case R.id.off: {
                irman.transmit(frequency, but.off);
                break;
            }
            case R.id.on: {
                irman.transmit(frequency, but.on);
                break;
            }
            case R.id.red: {
                irman.transmit(frequency, but.red);
                break;
            }
            case R.id.grn: {
                irman.transmit(frequency, but.grn);
                break;
            }
            case R.id.blu: {
                irman.transmit(frequency, but.blu);
                break;
            }
            case R.id.wht: {
                irman.transmit(frequency, but.wht);
                break;
            }
            case R.id.c1: {
                irman.transmit(frequency, but.c1);
                break;
            }
            case R.id.c2: {
                irman.transmit(frequency, but.c2);
                break;
            }
            case R.id.c3: {
                irman.transmit(frequency, but.c3);
                break;
            }
            case R.id.fls: {
                irman.transmit(frequency, but.flsh);
                break;
            }
            case R.id.c4: {
                irman.transmit(frequency, but.c4);
                break;
            }
            case R.id.c5: {
                irman.transmit(frequency, but.c5);
                break;
            }
            case R.id.c6: {
                irman.transmit(frequency, but.c6);
                break;
            }
            case R.id.str: {
                irman.transmit(frequency, but.str);
                break;
            }
            case R.id.c7: {
                irman.transmit(frequency, but.c7);
                break;
            }
            case R.id.c8: {
                irman.transmit(frequency, but.c8);
                break;
            }
            case R.id.c9: {
                irman.transmit(frequency, but.c9);
                break;
            }
            case R.id.fad: {
                irman.transmit(frequency, but.fade);
                break;
            }
            case R.id.c10: {
                irman.transmit(frequency, but.c10);
                break;
            }
            case R.id.c11: {
                irman.transmit(frequency, but.c11);
                break;
            }
            case R.id.c12: {
                irman.transmit(frequency, but.c12);
                break;
            }
            case R.id.smt: {
                irman.transmit(frequency, but.smth);
                break;
            }
        }
    }
}