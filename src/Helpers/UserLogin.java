/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Acer
 */
public class UserLogin {
    private String email;
    private String password;

    public UserLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @JsonProperty("Email")
    public String getEmail() { return email; }
    @JsonProperty("Email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("Password")
    public String getPassword() { return password; }
    @JsonProperty("Password")
    public void setPassword(String value) { this.password = value; }
    
}
