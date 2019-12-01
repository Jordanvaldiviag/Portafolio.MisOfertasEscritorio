/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Helpers.OfertaHelper;
import Models.Categoria;
import Models.Oferta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import portafolio.misofertasescritorio.Offers.MaintainerOffers;

/**
 *
 * @author Acer
 */
public class ServiceOferta {
    GenericServices service = new GenericServices();
    
    public ServiceOferta() {
    }
    
    public ArrayList<Oferta> ListarOfertas(){
        
        String result;
        ArrayList<Oferta> listaOfertas = new ArrayList<>();
        
        result = service.getRequest("http://ofertasportafoli-001-site1.dtempurl.com", "/api", "/oferta");
        ObjectMapper mapper = new ObjectMapper();
        Oferta[] arregloOferta = null;
        try {
            arregloOferta = mapper.readValue(result, Oferta[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaOfertas.addAll(Arrays.asList(arregloOferta));
           
        return listaOfertas;
          
    }
    
    public ArrayList<Categoria> ListarCategorias(){
        
        String result;
        ArrayList<Categoria> listaCategorias = new ArrayList<>();
        
        result = service.getRequest("http://ofertasportafoli-001-site1.dtempurl.com", "/api", "/categoria");
        ObjectMapper mapper = new ObjectMapper();
        Categoria[] arregloCategorias = null;
        try {
            arregloCategorias = mapper.readValue(result, Categoria[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaCategorias.addAll(Arrays.asList(arregloCategorias));
           
        return listaCategorias;
        
    }
    
    
    public String AgregarOferta(OfertaHelper oferta){
        GenericServices servicio = new GenericServices();
        String result = servicio.Post(oferta,"http://ofertasportafoli-001-site1.dtempurl.com/api/oferta");
        System.out.println(result);
        return result;
    }
    
    public String ActualizarOferta(OfertaHelper oferta){
        GenericServices servicio = new GenericServices();
        String varOferta = Integer.toString(MaintainerOffers.varSessionOferta);
        String result = servicio.Update(oferta, "http://ofertasportafoli-001-site1.dtempurl.com/api/oferta/",varOferta);
        return result;
    }
    
    public String EliminarOferta(int id){
        String idOferta = Integer.toString(id);
        GenericServices servicio = new GenericServices();
        String result = servicio.Delete(idOferta, "http://ofertasportafoli-001-site1.dtempurl.com/api/oferta/");
        return result;
    }
    
    
}
