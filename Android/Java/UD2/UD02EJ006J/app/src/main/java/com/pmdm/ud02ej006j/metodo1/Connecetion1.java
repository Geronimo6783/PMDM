package com.pmdm.ud02ej006j.metodo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.graphics.BitmapFactory;

public class Connecetion1 {
    public void setNetwork() {
        try {
            URL url = new URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjgifeYpeiAXU_d7MgXj8jKko-9TTYALn_rKxd2OmVLV3TjO7vBxvqYrKycgXb4RDDB7h_jqTrwQ4Ha1GHquPMQoG5BQzXhVEQ4eL_mqvkhKH6ZJpdMoS_60Z4UIddqXHJ8hk6JafAX644/s400/sachin_tendulkar_double_century.jpg");
            URLConnection connection = url.openConnection();
            HttpURLConnection HCon = (HttpURLConnection) connection;

            int ResCode = HCon.getResponseCode();
            System.out.println("Response Code is = " + ResCode);

            if (ResCode == HttpURLConnection.HTTP_OK) {
                InputStream ins = ((URLConnection) HCon).getInputStream();
                Data.StoreImg = BitmapFactory.decodeStream(ins);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}