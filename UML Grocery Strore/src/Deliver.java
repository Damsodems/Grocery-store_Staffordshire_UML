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
class Deliver extends User{
    private String nbrD;
    Scanner kybd = new Scanner(System.in) ;

    public Deliver() {
        super("dominos", "pizza");
        this.nbrD = "007";
    }
    
        public boolean loginD(){

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
        System.out.println("Welcome deliver number : " + nbrD);
        return true;
    }
    
    public String getNbr() {
        return nbrD;
    }

    public void setNbr(String nbr) {
        this.nbrD = nbr;
    }



    
    
}
