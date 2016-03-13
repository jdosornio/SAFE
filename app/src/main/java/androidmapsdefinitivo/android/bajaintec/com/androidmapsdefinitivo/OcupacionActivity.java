package androidmapsdefinitivo.android.bajaintec.com.androidmapsdefinitivo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class OcupacionActivity extends AppCompatActivity {


    private Button btnGuardar;
    private RadioButton rButtonIP, rButtonT, rButtonE, rButtonSO;
    private String correo, contrasena, usuario, ocupacion, sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocupacion);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        rButtonIP = (RadioButton) findViewById(R.id.rButtonIP);
        rButtonT = (RadioButton) findViewById(R.id.rButtonT);
        rButtonE = (RadioButton) findViewById(R.id.rButtonE);
        rButtonSO = (RadioButton) findViewById(R.id.rButtonSO);

        correo = getIntent().getStringExtra("correo");
        usuario = getIntent().getStringExtra("usuario");
        contrasena = getIntent().getStringExtra("contrasena");
        sexo = getIntent().getStringExtra("sexo");
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rButtonIP.isChecked()){
                    ocupacion="Trabajador";
                }else if(rButtonE.isChecked()){
                    ocupacion = "Independiente/Profesionista";
                }else if(rButtonSO.isChecked()){
                    ocupacion = "Estudiante";
                }else if(rButtonT.isChecked()){
                    ocupacion = "Sin ocupacion";
                }
                System.out.println(correo);
                Intent intent = new Intent(OcupacionActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }


}
