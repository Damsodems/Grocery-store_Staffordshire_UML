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
public class Shop {

    public static void mainMenu() {
        System.out.println("Please pick one :");
        System.out.println("1 : View List of Items");
        System.out.println("2 : Login as Customer");
        System.out.println("3 : Login as Manager");
        System.out.println("4 : Login as Deliver");
        System.out.println("5 : Exit");
        System.out.printf("Your choice : ");

        Scanner kybd = new Scanner(System.in);
        int menu = kybd.nextInt();
        kybd.nextLine();
        
            switch (menu) {
                case 1:
                    Item.itemList();
                    Item.printListC();
                    mainMenu();
                    

                case 2:
                    Customer customer = new Customer();
                    customer.loginC();
                    customerMenu();
                    

                case 3:
                    Manager manager = new Manager();
                    
                    boolean login = false;
                    login = manager.loginM();
                    if (login == true) {
                           managerMenu();
                    }
                    mainMenu();

                case 4:

                    Deliver deliver = new Deliver();
                    deliver.loginD();
                    mainMenu();

                case 5:
                    System.out.println("Thank you for you visit, see you soon");
                    break;

            }
        


    
    }

    public static void managerMenu() {
        System.out.println("Please pick one :");
        System.out.println("1 : Add an item");
        System.out.println("2 : View list of items");
        System.out.println("3 : Deleate an item");
        System.out.println("4 : Return to the main menu");
        System.out.println("Your choice :");

        Scanner kybd = new Scanner(System.in);
        int menu = kybd.nextInt();
        kybd.nextLine();

        switch (menu) {
            case 1:
                Item item = new Item();
                Item.itemList();
                item.createItem();
                System.out.println("Item added");
                managerMenu();
                
            case 2 : 
                Item.itemList();
                Item.printListM();
            
            case 3 :
                mainMenu();
        }
    }
    
    public static void customerMenu(){
        System.out.println("Please pick one :");
        System.out.println("1 : See the item list");
        System.out.println("2 : Add item to your basket");
        System.out.println("3 : Deleate an item to your basket");
        System.out.println("4 : Conclude your Order");
        System.out.println("5 : Return to the main menu");
        System.out.println("Your choice :");
        
        Scanner kybd = new Scanner(System.in);
        int menu = kybd.nextInt();
        kybd.nextLine();
        
            switch (menu) {
            case 1:
                break;
                
            case 2 : 
                break;
            
            case  5:
                mainMenu();
        }
        
    }
    
}
