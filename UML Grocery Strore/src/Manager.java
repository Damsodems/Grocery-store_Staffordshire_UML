/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author hacot
 */
class Manager extends User{
    private String nbrM;
    Scanner kybd = new Scanner(System.in);
    
    public Manager() {
        super("Gabro", "Precibro");
        this.nbrM = "01";
    }
    
     public boolean loginM(){

        System.out.println("Enter your ID : ");
        String  ID = kybd.nextLine();     
        System.out.println("Enter your password : ");
        String Password = kybd.nextLine();
        while((!ID.equals(iD)) && (!Password.equals(password) )  ){
            System.out.println("Your ID or your password is incorrect");
            System.out.println("Enter your ID : ");
            ID = kybd.nextLine();
            System.out.println("Enter your password : ");
            Password = kybd.nextLine();
        }
        System.out.println("Login Success");
        System.out.println("Welcome Manager : " + nbrM);
        return true;
    }
    
    public String getNbrM() {
        return nbrM;
    }

    public void setNbrM(String nbrM) {
        this.nbrM = nbrM;
    }
    
}
