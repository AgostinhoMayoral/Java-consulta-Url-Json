/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

/**
 *
 * @author tinho
 */
public class ArrayJson {

    public JSONArray arrayJsonHttps(String url) throws URISyntaxException {
        JSONTokener tokener = null;
        JSONArray arrayDeJson = null;

        try {
            //String url = "https://jsonplaceholder.typicode.com/users";
            URI urlAPI = new URI(String.valueOf(url));

            tokener = new JSONTokener(urlAPI.toURL().openStream());
            arrayDeJson = new JSONArray(tokener);

        } catch (IOException | NumberFormatException | JSONException e) {
            System.out.println(e);
        }
        return arrayDeJson;
    }

    Object getJSONObject(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int arrayJsonHttps(JSONArray array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
