/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Helpers.ProductoHelper;
import Models.Categoria;
import java.util.ArrayList;
import Models.ProductoElement;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import portafolio.misofertasescritorio.products.MaintainerProducts;

/**
 *
 * @author Acer
 */

public class ServiceProducto {
    
    GenericServices service = new GenericServices();
    
    public ServiceProducto() {
    }
    
    public ArrayList<ProductoElement> ListarProductos(){
        
        String result;
        ArrayList<ProductoElement> listaProductos = new ArrayList<>();
        
        result = service.getRequest("http://ofertasportafoli-001-site1.dtempurl.com", "/api", "/producto");
        ObjectMapper mapper = new ObjectMapper();
        ProductoElement[] arregloProductos = null;
        try {
            arregloProductos = mapper.readValue(result, ProductoElement[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaProductos.addAll(Arrays.asList(arregloProductos));
           
        return listaProductos;
          
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
    
    
    public String AgregarProducto(ProductoHelper producto){
        GenericServices servicio = new GenericServices();
        
        String result = servicio.Post(producto,"http://ofertasportafoli-001-site1.dtempurl.com/api/producto");
        System.out.println(result);
        
        return result;
    }
    
    public String ActualizarProducto(ProductoHelper producto){
        GenericServices servicio = new GenericServices();
        
        String varProducto = Long.toString(MaintainerProducts.varSessionProducto);
        
        String result = servicio.Update(producto, "http://ofertasportafoli-001-site1.dtempurl.com/api/producto/", varProducto);
        
        return result;
        
    }
    
    public String EliminarProducto(int id){
        String idProducto = Integer.toString(id);
        
        GenericServices servicio = new GenericServices();
        
        String result = servicio.Delete(idProducto, "http://ofertasportafoli-001-site1.dtempurl.com/api/producto/");
        
        return result;
    }
    
}