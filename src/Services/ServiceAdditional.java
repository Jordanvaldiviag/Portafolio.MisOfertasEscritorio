/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Regiones;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Acer
 */
public class ServiceAdditional {
    
    GenericServices service = new GenericServices();
    
    public ServiceAdditional(){
        
    }
    
    public ArrayList<Regiones> ListarRegiones(){
        
        String result;
        ArrayList<Regiones> listaRegiones = new ArrayList<>();
        
        result = service.getRequest("https://raw.githubusercontent.com/", "Jordanvaldiviag/jsonform/master/", "divisionTerritorial.json");
        ObjectMapper mapper = new ObjectMapper();
        Regiones[] arregloRegiones = null;
        try {
            arregloRegiones = mapper.readValue(result, Regiones[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceAdditional.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaRegiones.addAll(Arrays.asList(arregloRegiones));
           
        return listaRegiones;
          
    }
    
}
