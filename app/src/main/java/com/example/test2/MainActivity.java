package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_ENABLE_BT =  0;
    private Switch bluetooth_switch;
    private bluetooth_class btHandler = new bluetooth_class();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(MainActivity.this, "welcome",
                Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main);
        bluetooth_switch = (Switch) findViewById(R.id.blue_switch);
        bluetooth_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bluetooth_switch.isChecked()) {

                    start_bluetooth();

                    System.out.println("WAIN");

                    Toast.makeText(MainActivity.this, "Bluetooth is on",
                            Toast.LENGTH_LONG).show();
                    start_discorvery_bluetooth();

                } else {
                    turn_off_bluetooth();

                    Toast.makeText(MainActivity.this, "Bluetooth is off",
                            Toast.LENGTH_SHORT).show();

                    System.out.println("Bluetooth is off");

                }
            }
        });
        }

    private void start_discorvery_bluetooth() {
        BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        if(!bAdapter.isDiscovering()){
            bAdapter.startDiscovery();
            Toast.makeText(getApplicationContext(),"Making Device Discoverable",Toast.LENGTH_SHORT).show();
        }


    }





    private void turn_off_bluetooth() {

        BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        bAdapter.cancelDiscovery();
        bAdapter.disable();
    }


    private void start_bluetooth() {
        BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bAdapter == null) {
            // Device doesn't support Bluetooth
            Toast.makeText(MainActivity.this, "Bluetooth is not supported",Toast.LENGTH_LONG).show();
            System.out.println("NO BLUETOOTH EXISITS");
        }

        if (!bAdapter.isEnabled()) {
            System.out.println("INNE I IF SATS");
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }
    }

}
