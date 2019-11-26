/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author cvargas
 */
public class UserSession {
    public String Email;
    public String Rut;
    public int IdUserType;
    public String Message;
    public boolean IsSuccess;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public int getIdUserType() {
        return IdUserType;
    }

    public void setIdUserType(int IdUserType) {
        this.IdUserType = IdUserType;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public boolean isIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(boolean IsSuccess) {
        this.IsSuccess = IsSuccess;
    }
    
    
    

    
    
    
    
}
