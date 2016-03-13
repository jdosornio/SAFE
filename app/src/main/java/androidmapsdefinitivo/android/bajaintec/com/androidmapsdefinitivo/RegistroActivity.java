package androidmapsdefinitivo.android.bajaintec.com.androidmapsdefinitivo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    private Button mContinuar;
    private EditText correo, usuario, contrasena;
    private Intent  i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        mContinuar = (Button) findViewById(R.id.continuar);
        correo = (EditText) findViewById(R.id.correo_edit);
        usuario = (EditText) findViewById(R.id.usuario_edit_text);
        contrasena = (EditText) findViewById(R.id.contrasena_edit);

        mContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anio,mes,dia 4,2,2 -
                //mUsuario.getmFecha();
                Intent i = new Intent(RegistroActivity.this, RegistroSexoActivity.class);
                i.putExtra("correo", correo.getText().toString());
                i.putExtra("usuario", usuario.getText().toString());
                i.putExtra("contrasena", contrasena.getText().toString());
                startActivity(i);
            }
        });
    }

}
