package lab2apprun.gr3.compumovil.udea.edu.co.lab2apprun;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    private EditText email;
    public static final String KEY1 = "datakey1";
    public static final String KEY2 = "datakey1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.UserText);
        pass = (EditText) findViewById(R.id.PassText);

        Intent intent = getIntent();
        String usuario = intent.getStringExtra(Registro.KEY01);
        user.setText(usuario);

        String contrasena = intent.getStringExtra(Registro.KEY02);
        pass.setText(contrasena);

    }

    public void Sing_In (View v){  // llama el activity Registro
        Intent singIn =new Intent (this, Registro.class);
        this.startActivity(singIn);
    }

    public void Start_Session (View v){  //llama el activity Session
        Intent sesion = new Intent (this, Session.class);
        this.startActivity(sesion);
    }










}
