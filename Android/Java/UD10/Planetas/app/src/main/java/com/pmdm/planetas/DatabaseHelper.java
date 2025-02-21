package com.pmdm.planetas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "planets_db";
    private static final String TABLE_NAME = "planets";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_RADIUS = "radius";
    private static final String KEY_DISTANCE = "distance";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PLANETS_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_NAME + " TEXT,"
                + KEY_RADIUS + " REAL,"
                + KEY_DISTANCE + " REAL" + ")";
        db.execSQL(CREATE_PLANETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addPlanet(Planet planet) {
        // Obtiene una instancia de la base de datos en modo escritura
        SQLiteDatabase db = this.getWritableDatabase();

        // Crea un objeto ContentValues para almacenar los valores a insertar en la base de datos
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, planet.getName()); // Asigna el nombre del planeta a la columna KEY_NAME
        values.put(KEY_RADIUS, planet.getRadius()); // Asigna el radio del planeta a la columna KEY_RADIUS
        values.put(KEY_DISTANCE, planet.getDistanceToSun()); // Asigna la distancia del planeta al sol a la columna KEY_DISTANCE

        // Inserta los valores en la tabla 'planets' de la base de datos
        long result = db.insert(TABLE_NAME, null, values);

        // Cierra la conexión con la base de datos
        db.close();

        // Comprueba si la inserción fue exitosa, retorna true si el resultado es diferente de -1 (indicando éxito)
        return result != -1;
    }

    public List<Planet> getAllPlanets() {
        List<Planet> planetList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex(KEY_NAME));
                double radius = cursor.getDouble(cursor.getColumnIndex(KEY_RADIUS));
                double distance = cursor.getDouble(cursor.getColumnIndex(KEY_DISTANCE));

                Planet planet = new Planet(name, radius, distance);
                planetList.add(planet);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return planetList;
    }
}