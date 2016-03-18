package lab2apprun.gr3.compumovil.udea.edu.co.lab2apprun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Session extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }


    public void LogOut (View v){  //llama el activity Session
        Intent sesion = new Intent (this, MainActivity.class);
        this.startActivity(sesion);
    }


}
