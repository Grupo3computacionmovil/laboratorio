package lab2apprun.gr3.compumovil.udea.edu.co.lab2apprun;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    private EditText email;
    public static String KEY01 = "messagekey";
    public static String KEY02 = "messagekey";
    public static int REQUEST = 45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        DbHelper dbHelper = new DbHelper(this); //Instancia de DbHelper
        SQLiteDatabase db = dbHelper.getWritableDatabase(); //Obtener instancia de la BD
        ContentValues values = new ContentValues();
        values.put(StatusContract.Column.USER,"");
        values.put(StatusContract.Column.PASS, "");
        db.insertWithOnConflict(StatusContract.TABLE, null, values,
                SQLiteDatabase.CONFLICT_IGNORE); //Se guarda la fila en la base de datos



        user = (EditText) findViewById(R.id.UserTextReg);
        pass = (EditText) findViewById(R.id.PassTextReg);
        email = (EditText) findViewById(R.id.EmailTextReg);

    }

    public void Registrar (View v){ //llama el main


        Intent intent = new Intent(this, MainActivity.class);

        String usuario = user.getText().toString();
        String contrasena = pass.getText().toString();

        intent.putExtra(KEY01, usuario);
        intent.putExtra(KEY02, contrasena);


        startActivityForResult(intent, REQUEST);

    }



    public void Cancelar (View v) { //llama el main
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, REQUEST);
    }





    public void registro (View V)
    {
        DbHelper dbHelper = new DbHelper(this); //Instancia de DbHelper
        SQLiteDatabase db = dbHelper.getWritableDatabase(); //Obtener instancia de la BD
        ContentValues values = new ContentValues();
        values.put(StatusContract.Column.USER, user.getText().toString());
        values.put(StatusContract.Column.PASS, pass.getText().toString());
        values.put(StatusContract.Column.EMAIL, email.getText().toString());
        db.insertWithOnConflict(StatusContract.TABLE, null, values,
                SQLiteDatabase.CONFLICT_IGNORE); //Se guarda la fila en la base de datos
    }

}