package androidmapsdefinitivo.android.bajaintec.com.androidmapsdefinitivo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegistroSexoActivity extends AppCompatActivity {

    private Button btnContinuar;
    private RadioButton rButtonF;
    private String correo, contrasena, usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_sexo);

        btnContinuar = (Button) findViewById(R.id.btnContinuar);
        rButtonF = (RadioButton) findViewById(R.id.rButtonF);

        correo = getIntent().getStringExtra("correo");
        usuario = getIntent().getStringExtra("usuario");
        contrasena = getIntent().getStringExtra("contrasena");



        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistroSexoActivity.this, OcupacionActivity.class);
                i.putExtra("correo", correo);
                i.putExtra("usuario", usuario);
                i.putExtra("contrasena", contrasena);
                startActivity(i);
                if(rButtonF.isChecked()){
                    i.putExtra("sexo", "F");
                }else{
                    i.putExtra("sexo", "M");
                }
            }
        });

    }
}
