package com.trabajo.carlos.a014_boletin2ej4;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Carlos Prieto on 26/11/2017.
 */

public class Util {

    public static void dialogo(Activity a, String titulo, String mensaje, final boolean conEntrada, final boolean okCancel){

        AlertDialog.Builder dialog = new AlertDialog.Builder(a);
        dialog.setTitle(titulo);
        dialog.setMessage(mensaje);



        if (conEntrada){

            final EditText input = new EditText(a);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            input.setLayoutParams(lp);
            dialog.setView(input);

        }

        if (!okCancel){

            dialog.setNeutralButton("OK", null);

        }else{

            dialog.setNeutralButton("OK", null);

            dialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                }
            });

        }

        dialog.create().show();

    }

}


