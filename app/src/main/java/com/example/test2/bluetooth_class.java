package com.example.test2;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.widget.Toast;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class bluetooth_class extends Activity {

    private static final int REQUEST_ENABLE_BT = 0;

    void start_bluetooth() {
        /*BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            // Device doesn't support Bluetooth
            Toast.makeText(bluetooth_class.this, "Bluetooth is not supported",Toast.LENGTH_LONG).show();
            System.out.println("NO BLUETOOTH EXISITS");
        }

        if (!bluetoothAdapter.isEnabled()) {
            System.out.println("INNE I IF SATS");
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);

        }*/

    }



}