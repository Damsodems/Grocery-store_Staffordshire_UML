/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hacot
 */

public class User {
    public String iD;
    public String password;
    
    public User(String iD, String password){
        this.iD = iD;
        this.password = password;
    }
    
    public void setID(String newID){
        this.iD = newID;
    }
            
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
    public String getID(){
        return iD;
    }
    
    public String getPassword(){
        return password;
    }
}
