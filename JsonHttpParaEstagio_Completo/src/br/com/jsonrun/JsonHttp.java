/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsonrun;

import br.com.frames.ResultadosDosExercicios;
import br.com.classes.ExerciciosEstagio;
import br.com.classes.ArrayJson;
import java.net.URISyntaxException;
import org.json.JSONArray;



/**
 *
 * @author tinho
 */
public class JsonHttp {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException {
        
        String url = "https://jsonplaceholder.typicode.com/users";
        ArrayJson x = new ArrayJson();        
        ExerciciosEstagio y = new ExerciciosEstagio();
        JSONArray jsonArray = null;
        jsonArray = x.arrayJsonHttps(url);
       
        System.out.println("\n Sending 'GET' request to URL : " + url + "\n");
        
        
        
        System.out.println("1) Os websites de todos os usuários\n"); 
        System.out.println(y.getWebSitesClientes(jsonArray, "website"));
        
        System.out.println("2) O email da usuária que possui o campo username igual a \"Samantha\"\n");
        System.out.println(y.getEmailByName(jsonArray, "username","Samantha")+"\n");
        
        System.out.println("3) EXTRA: Mostrar o total de usuários do hemisfério Sul\n");
        System.out.println(y.getCountSouthUsers(jsonArray, "address","geo"));
        
        new ResultadosDosExercicios().setVisible(true);
        
      /*  System.out.println("1) Os websites de todos os usuários\n");        
        y.getWebSitesClientes(x.arrayJsonHttps(url), "website");
        
        
        System.out.println("2) O email da usuária que possui o campo username igual a \"Samantha\"\n");        
        y.getEmailByName(x.arrayJsonHttps(url), "username", "Samantha");
        
        
        System.out.println("3) EXTRA: Mostrar o total de usuários do hemisfério Sul\n");        
        y.getCountSouthUsers(x.arrayJsonHttps(url), "address", "geo");
        
        */

    }
}
