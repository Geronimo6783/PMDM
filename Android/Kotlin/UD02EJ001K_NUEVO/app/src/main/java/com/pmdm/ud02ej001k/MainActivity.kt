package com.pmdm.ud02ej001k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/**
 * The main activity of the application that represents the entry point when the app is launched.
 * This activity inflates the main layout and demonstrates the use of the [Car] class.
 *
 * @see Car The class representing a car used in this activity.
 */
class MainActivity : AppCompatActivity() {
    /**
     * Called when the activity is starting. This is where most initialization should happen.
     * The method sets the content view and creates an instance of the [Car] class, demonstrating
     * how to use the [Car.drive] and [Car.addPassenger] methods.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being
     * shut down, this contains the data it most recently supplied in [onSaveInstanceState].
     * Otherwise, it is null.
     * @see Car The car class used in this activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instanciando un objeto de la clase Car
        val myCar = Car(brand = "Toyota")

        // Usando los métodos de la clase Car e imprimiendo en la consola
        myCar.drive(100)
        myCar.addPassenger("John")
    }
}
