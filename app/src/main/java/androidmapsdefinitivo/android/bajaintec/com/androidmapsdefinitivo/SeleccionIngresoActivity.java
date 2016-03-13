package androidmapsdefinitivo.android.bajaintec.com.androidmapsdefinitivo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeleccionIngresoActivity extends AppCompatActivity {

    private Button mIngreso;
    private Button mRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_ingreso);
        inicializacionComponentes();
    }

    private void inicializacionComponentes(){

        mIngreso = (Button) findViewById(R.id.ingresar);
        mIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeleccionIngresoActivity.this, IngresoActivity.class);
                startActivity(intent);
            }
        });

        mRegistrar = (Button) findViewById(R.id.crear_cuenta);
        mRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeleccionIngresoActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });

    }


}
