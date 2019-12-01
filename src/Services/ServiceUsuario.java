/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Helpers.UsuarioHelper;
import Models.TipoUsuario;
import Models.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import portafolio.misofertasescritorio.Users.MaintainerUsers;

/**
 *
 * @author Acer
 */
public class ServiceUsuario {
    
    GenericServices service = new GenericServices();
    
    public ServiceUsuario() {
    }
    
    public ArrayList<Usuario> ListarUsuarios(){
        String result;
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        result = service.getRequest("http://ofertasportafoli-001-site1.dtempurl.com/", "/api", "/usuario");
        ObjectMapper mapper = new ObjectMapper();
        Usuario[] arregloUsuario = null;
        try {
            arregloUsuario = mapper.readValue(result, Usuario[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaUsuario.addAll(Arrays.asList(arregloUsuario));
        return listaUsuario;
    }
    
    public String AgregarUsuario(UsuarioHelper usuario){
        GenericServices servicio = new GenericServices();
        String result = servicio.Post(usuario, "http://ofertasportafoli-001-site1.dtempurl.com/api/usuario");
        System.out.println(result);
        return result;
    }
    
    public String ActualizarUsuario(UsuarioHelper usuario){
        GenericServices servicio = new GenericServices();
        String varUsuario = Long.toString(MaintainerUsers.varSessionUser);
        String result = servicio.Update(usuario, "http://ofertasportafoli-001-site1.dtempurl.com/api/usuario/", varUsuario);
        return result;
    }
    
    
    public String EliminarUsuario(int id){
        String idUsuario = Integer.toString(id);
        GenericServices servicio = new GenericServices();
        String result = servicio.Delete(idUsuario, "http://ofertasportafoli-001-site1.dtempurl.com/api/usuario/");
        return result;
    }
    
    public ArrayList<TipoUsuario> ListaTipoUsuario(){
        String result;
        ArrayList<TipoUsuario> listaTipoUsuario = new ArrayList<>();
        result = service.getRequest("http://ofertasportafoli-001-site1.dtempurl.com/", "/api", "/tipousuario");
        ObjectMapper mapper = new ObjectMapper();
        TipoUsuario[] arregloTipoUsuario = null;
        try {
            arregloTipoUsuario = mapper.readValue(result, TipoUsuario[].class);
        } catch (IOException ex) {
            Logger.getLogger(ServiceUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaTipoUsuario.addAll(Arrays.asList(arregloTipoUsuario));
        return listaTipoUsuario;
    }
}
