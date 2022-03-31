package com.example.trabajopractico1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class UsbDetectado extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean estado = intent.getBooleanExtra("connected",false); // getBoleeanExtra me dice si esta conectado o no

        if(estado){
            //String numero = "113";
            Uri llamar = Uri.parse("tel:113");

            Intent i = new Intent(Intent.ACTION_CALL,llamar);

            context.startActivity(i);
        }
        
    }
}
