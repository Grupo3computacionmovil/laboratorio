package lab2apprun.gr3.compumovil.udea.edu.co.lab2apprun;

import android.provider.BaseColumns;

public class StatusContract {

    public static final String DB_NAME = "timeline.db"; //Nombre de la DB
    public static final int DB_VERSION = 1; //Versión de la DB
    public static final String TABLE = "status"; //Nombre de la tabla

    public class Column { //Columnas de la tabla
        public static final String ID = BaseColumns._ID; //El ID se suele definir así por convención
        public static final String USER = "user";
        public static final String PASS = "message";
        public static final String EMAIL = "created_at";
    }
}
