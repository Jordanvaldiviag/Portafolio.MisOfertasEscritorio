/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Validations {
    
    public static boolean validarNoVacio(String texto){
        if (texto==null){//si el texto viene vacio retornara falso para asi al crear el usuario no se acepten nulos
            return false;
        }
        return (texto.trim().length() != 0);//retornara true si el largo del texto es diferente a 0
    }
    
    public static Integer validarNumero(String texto){
        Integer resultado = 0;                     
        try{                                          
            resultado = Integer.parseInt(texto);
        } catch (NumberFormatException ex){
            Logger.getLogger(Validations.class.getName()).log(Level.WARNING, "texto no es un entero:{0}", texto);
        }
        return resultado;// si retorna nulo es po que no se pudo convertir el numero
    }
    
    public static boolean validarIguales(String texto1, String texto2){
        return (texto1.equals(texto2));//validamos si las contraseñas que asignaremos son iguales
    }
    
    public static Date validarFechas(String texto){
        Date resultado = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            resultado = sdf.parse(texto);
        }catch(ParseException ex){
         Logger.getLogger(Validations.class.getName()).log(Level.WARNING, "El texto no es una fecha: {0}", texto);
        }
        return resultado;
    }
    
    
    
    public static boolean validarLargo(String texto){
        return (texto.trim().length() == 9);
    }
    
    public static Long validarNumeroLong(String texto){
        Long resultado = null;                     
        try{                                          
            resultado = Long.parseLong(texto);
        } catch (NumberFormatException ex){
            Logger.getLogger(Validations.class.getName()).log(Level.WARNING, "texto no es un entero tipo long:{0}", texto);
        }
        if (resultado == null) {
            return Long.parseLong("0");// si retorna 0 es po que no se pudo convertir el numero
        }else{
            return resultado;
        }
    }
}
