package com.pmdm.faltarclase.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BD extends SQLiteOpenHelper {

    public static final String NOMBRE_BD = "baseDeDatos";

    public static final int VERSION_BD = 2;

    public static final String TABLA = "tabla";

    public static final String COLUMNA_ID = "id";

    public static final String COLUMNA_MODELO = "modelo";

    public static final String COLUMNA_KILOMETROS = "kilometros";

    public static final String COLUMNA_ASIGNATURA = "aignatura";

    public BD(Context context){
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE " + TABLA + " (" + COLUMNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMNA_ASIGNATURA + " TEXT, "
        + COLUMNA_KILOMETROS + " INTEGER, " + COLUMNA_MODELO + " TEXT)");
    }

    public void insertarDatos(String modelo, int kilometros, String asignatura){
        ContentValues datos = new ContentValues();
        datos.put(COLUMNA_ASIGNATURA, asignatura);
        datos.put(COLUMNA_MODELO, modelo);
        datos.put(COLUMNA_KILOMETROS, kilometros);

        SQLiteDatabase baseDeDatos = getWritableDatabase();
        baseDeDatos.insert(TABLA, null, datos);
    }

    public void eliminarDatos(int id){
        getWritableDatabase().delete(TABLA, COLUMNA_ID + "=" + id, null);
    }

    public DTODatos obtenerDatos(int id){
        Cursor cursor = getReadableDatabase().query(TABLA, null, COLUMNA_ID + " = " + Integer.toString(id), null, null, null, null);

        if(cursor.moveToNext()){
            return new DTODatos(id, cursor.getString(cursor.getColumnIndexOrThrow(COLUMNA_MODELO)), cursor.getInt(cursor.getColumnIndexOrThrow(COLUMNA_KILOMETROS)), cursor.getString(cursor.getColumnIndexOrThrow(COLUMNA_ASIGNATURA)));
        }

        return null;
    }

    public void eliminarUsuario(int id){
        getWritableDatabase().delete(TABLA, COLUMNA_ID + "=?", new String[]{String.valueOf(id)});
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLA);
        onCreate(db);
    }
}
