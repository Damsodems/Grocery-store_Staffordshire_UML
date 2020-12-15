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
  class Customer extends User{
    Scanner kybd = new Scanner(System.in);
    private String adress;
    private String phoneNbr;
    private String firstName;
    private String lastName;

    public Customer() {
        super("Dan", "Carter");
        this.adress = "19 leek road, Stoke on trent";
        this.phoneNbr = "123456";
        this.firstName = "Brotoine";
        this.lastName = "Bronniel";
    }
   
    
    public boolean loginC(){

        System.out.println("Enter your ID : ");
        String  ID = kybd.nextLine();     
        System.out.println("Enter your password : ");
        String Password = kybd.nextLine();
        while((!iD.equals(ID)) && (!password.equals(Password) )  ){
            System.out.println("Your ID or your password is incorrect");
            System.out.println("Enter your ID : ");
            ID = kybd.nextLine();
            System.out.println("Enter your password : ");
            Password = kybd.nextLine();
        }
        System.out.println("Login Success");
        
        return true;
    }
    
    

    public String getAdress() {
        return adress;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  


}
