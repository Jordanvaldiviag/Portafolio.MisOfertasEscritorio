/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Helpers.EmpresaHelper;
import Models.Empresas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import portafolio.misofertasescritorio.business.MaintainerBusiness;

/**
 *
 * @author Acer
 */
public class ServiceEmpresa {
    
    GenericServices service = new GenericServices();
    
    public ServiceEmpresa() {
    }
    
    public ArrayList<Empresas> ListarEmpresas(){
        
        String result;
        ArrayList<Empresas> listaEmpresas = new ArrayList<>();
        
        result = service.getRequest("http://ofertasportafoli-001-site1.dtempurl.com/", "/api", "/empresa");
        ObjectMapper mapper = new ObjectMapper();
        Empresas[] arregloEmpresas = null;
        try {
            arregloEmpresas = mapper.readValue(result, Empresas[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaEmpresas.addAll(Arrays.asList(arregloEmpresas));
           
        return listaEmpresas;
          
    }
    
    public String AgregarEmpresa(EmpresaHelper empresa){
        GenericServices servicio = new GenericServices();
        
        String result = servicio.Post(empresa,"http://ofertasportafoli-001-site1.dtempurl.com/api/empresa");
        System.out.println(result);
        
        return result;
    }
    
    public String ActualizarEmpresa(EmpresaHelper empresa){
        GenericServices servicio = new GenericServices();
        
        String varEmpresa = Long.toString(MaintainerBusiness.varSessionEmpresa);
        
        String result = servicio.Update(empresa, "http://ofertasportafoli-001-site1.dtempurl.com/api/empresa/", varEmpresa);
        
        return result;
    }
    
    
    public String eliminarEmpresa(int id){
        
        String idEmpresa = Integer.toString(id);
        
        GenericServices servicio = new GenericServices();
        
        String result = servicio.Delete(idEmpresa, "http://ofertasportafoli-001-site1.dtempurl.com/api/empresa/");
        
        return result;
                
    }
    
}
