package com.trabajo.carlos.a014_boletin2ej4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText edtTitulo, edtMensaje;
    private Button btnCrear;
    //private Switch swEdittext, swBoton;
    private RadioButton rbEditSi, rbEditNo, rbUnBoton, rbDosBotones;
    private RadioGroup rdgroup;

    boolean conEntrada = false;
    boolean okCancel = false;
    String titulo, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMensaje = findViewById(R.id.edtMensaje);
        edtTitulo = findViewById(R.id.edtTitulo);
        btnCrear = findViewById(R.id.btnCrear);
        //swBoton = findViewById(R.id.swBoton);
        //swEdittext = findViewById(R.id.swEdittext);
        rbEditSi = findViewById(R.id.rbEditSi);
        rbEditNo = findViewById(R.id.rbEditNo);
        rbUnBoton = findViewById(R.id.rbUnBoton);
        rbDosBotones = findViewById(R.id.rbDosBotones);
        rdgroup = findViewById(R.id.rdgroup);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = edtTitulo.getText().toString();
                mensaje = edtMensaje.getText().toString();

                if (rbEditSi.isChecked()){

                    conEntrada = true;
                    //Util.dialogo(MainActivity.this, titulo, mensaje, conEntrada);

                }else if (rbEditNo.isChecked()){

                    conEntrada = false;
                    //Util.dialogo(MainActivity.this, titulo, mensaje, conEntrada);

                }

                if (rbUnBoton.isChecked()){

                    okCancel = false;


                }else if (rbDosBotones.isChecked()){

                    okCancel = true;

                }

                Util.dialogo(MainActivity.this, titulo, mensaje, conEntrada, okCancel);

            }
        });

    }


}
