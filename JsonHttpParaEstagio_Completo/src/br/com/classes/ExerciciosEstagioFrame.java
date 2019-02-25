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
public class ExerciciosEstagioFrame {
    
    
    
    

    public ArrayList getPreencheTabela(JSONArray array, String nome) {

        ArrayList<String> objetosJSON = new ArrayList<>();
        //  String b = "";

        for (int i = 0; i < array.length(); i++) {

            String novoObjtoJSONWebsite = array.getJSONObject(i).getString(nome);
            objetosJSON.add(novoObjtoJSONWebsite);
            // b += (objetosJSON.get(i) + "\n");
        }
        return objetosJSON;
    }
    
    
    
    

    public String getUserList(JSONArray array, String tipo) {

        ArrayList<String> objetosJSON = new ArrayList<>();
        String b = "";

        for (int i = 0; i < array.length(); i++) {

            String novoObjtoJSONWebsite = array.getJSONObject(i).getString(tipo);
            objetosJSON.add(novoObjtoJSONWebsite);
            b += (objetosJSON.get(i) + "\n");
        }
        return b;
    }
    
    
    
    

    public String getEmailByName(JSONArray array, String nick) {
        String novoObjtoJSONEmail = "";
        for (int i = 0; i < array.length(); i++) {

            String novoObjtoJSONUsername = array.getJSONObject(i).getString("username");

            if (novoObjtoJSONUsername.equals(nick)) {
                novoObjtoJSONEmail = array.getJSONObject(i).getString("email");
                i = array.length();
            } else {
                novoObjtoJSONEmail = "Usuario não encontrado";
            }
        }
        return novoObjtoJSONEmail;
    }
    
    
    

    public String getCountSulNorteLesteOeste(JSONArray array, String hemisferio) {

        int quantidadeSul = 0;
        int quantidadeNorte = 0;
        int quantidadeLeste = 0;
        int quantidadeOeste = 0;
        int resultado = 0;

        for (int i = 0; i < array.length(); i++) {

            if (Float.parseFloat(array.getJSONObject(i)
                    .getJSONObject("address").getJSONObject("geo").getString("lat")) < 0) {

                quantidadeSul++;
            }
            if (Float.parseFloat(array.getJSONObject(i)
                    .getJSONObject("address").getJSONObject("geo").getString("lat")) > 0) {

                quantidadeNorte++;
            }
            if (Float.parseFloat(array.getJSONObject(i)
                    .getJSONObject("address").getJSONObject("geo").getString("lng")) > 0) {

                quantidadeLeste++;
            }
            if (Float.parseFloat(array.getJSONObject(i)
                    .getJSONObject("address").getJSONObject("geo").getString("lng")) < 0) {

                quantidadeOeste++;
            }

        }
        if ("Sul".equals(hemisferio)) {
            resultado = quantidadeSul;
        }
        if ("Norte".equals(hemisferio)) {
            resultado = quantidadeNorte;
        }
        if ("Leste".equals(hemisferio)) {
            resultado = quantidadeLeste;
        }
        if ("Oeste".equals(hemisferio)) {
            resultado = quantidadeOeste;
        }
        return String.valueOf(resultado);
    }
    
    
    
    

    public String getTipotSulNorte(JSONArray array,int id) {
        
        String resultado = "";

            if (Float.parseFloat(array.getJSONObject(id)
                    .getJSONObject("address").getJSONObject("geo").getString("lat")) < 0) {

                resultado = "Sul";
            }
            if (Float.parseFloat(array.getJSONObject(id)
                    .getJSONObject("address").getJSONObject("geo").getString("lat")) > 0) {

                resultado = "Norte";
            } 

        return resultado;
    }
    
    
    
    
    
    
    

    public String getTipotLesteOeste(JSONArray array, int id) {
       
        String resultado = "";        

            if (Float.parseFloat(array.getJSONObject(id)
                    .getJSONObject("address").getJSONObject("geo").getString("lng")) > 0) {

                resultado = "Leste";
            }
            if (Float.parseFloat(array.getJSONObject(id)
                    .getJSONObject("address").getJSONObject("geo").getString("lng")) < 0) {

                resultado = "Oeste";
            }        
        return resultado;
    }

}
