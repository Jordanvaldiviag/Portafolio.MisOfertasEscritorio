/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Helpers.UserLogin;

/**
 *
 * @author Acer
 */
public class ServiceLogin {
    
    GenericServices genericServices = new GenericServices();
    
    public String Login(UserLogin userLogin){
        String result = GenericServices.Post(userLogin,"http://ofertasportafoli-001-site1.dtempurl.com/api/usuariologin");
        System.out.println(result);
        
        return result;
    }
    
}
