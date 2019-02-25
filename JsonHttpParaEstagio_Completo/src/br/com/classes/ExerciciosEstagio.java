/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import java.util.ArrayList;
import org.json.JSONArray;

/**
 *
 * @author tinho
 */
public class ExerciciosEstagio{

        

    public String getWebSitesClientes(JSONArray array, String nome) {

        ArrayList<String> objetosJSON = new ArrayList<String>();
        String b = "";

        for (int i = 0; i < array.length(); i++) {

            String novoObjtoJSONWebsite = array.getJSONObject(i).getString(nome);
            objetosJSON.add(novoObjtoJSONWebsite);
            b += (objetosJSON.get(i) + "\n");
        }        
        return b;
    }

    public String getEmailByName(JSONArray array, String username, String nick) {

        String novoObjtoJSONEmail ="";
        
        for (int i = 0; i < array.length(); i++) {

            String novoObjtoJSONUsername = array.getJSONObject(i).getString(username);            
            
            if (novoObjtoJSONUsername.equals(nick)) {

                 novoObjtoJSONEmail = array.getJSONObject(i).getString("email");
             //   System.out.println(novoObjtoJSONEmail + "\n");

            }
        }
        return novoObjtoJSONEmail;
    }

    public String getCountSouthUsers(JSONArray array, String address, String geo) {

        int quantidadeSul = 0;

        for (int i = 0; i < array.length(); i++) {

            if (Float.parseFloat(array.getJSONObject(i)
                    .getJSONObject(address).getJSONObject(geo).getString("lat")) < 0) {

                quantidadeSul++;
            }
        }
     //   System.out.println(quantidadeSul + "\n");
        
        return String.valueOf(quantidadeSul);

    }

}
