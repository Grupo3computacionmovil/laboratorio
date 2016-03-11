package lab2apprun.gr3.compumovil.udea.edu.co.lab2apprun;

import android.content.ContentValues;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.UserTextReg);
        pass = (EditText) findViewById(R.id.PassTextReg);
        email = (EditText) findViewById(R.id.EmailTextReg);


        DbHelper dbHelper = new DbHelper(this); //Instancia de DbHelper
        SQLiteDatabase db = dbHelper.getWritableDatabase(); //Obtener instancia de la BD
        ContentValues values = new ContentValues();
        values.put(StatusContract.Column.USER,"student");
        values.put(StatusContract.Column.PASS,"Contrasena");
        values.put(StatusContract.Column.EMAIL, "Correo");
        db.insertWithOnConflict(StatusContract.TABLE, null, values,
                SQLiteDatabase.CONFLICT_IGNORE); //Se guarda la fila en la base de datos
    }


    public void Registro (View V)
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
