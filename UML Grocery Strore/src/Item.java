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
public class Item {

    private String name;
    private double boughtPrice;
    private double sellingPrice;
    private int quantity;
    static Item[] list = new Item[20];
    Scanner kybd = new Scanner(System.in);

    public Item(String name, double boughtPrice, double sellingPrice, int quantity) {
        this.name = name;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    public Item() {
        this.name = " ";
        this.boughtPrice = 0;
        this.sellingPrice = 0;
        this.quantity = 0;
    }

    public static void itemList() {

        list[0] = new Item("Apple", 1, 2, 20);
        list[1] = new Item("Banana", 0.50, 1.20, 20);
        list[2] = new Item("Grapes", 1.34, 2.10, 20);
        list[3] = new Item("Chicken", 2, 5, 20);
        list[4] = new Item("Steak", 2, 5, 20);
        list[5] = new Item("Salmon", 4, 7, 20);
        list[6] = new Item("Tuna", 3.50, 6.20, 20);
        list[7] = new Item("Rice 1kg", 0.30, 1.20, 20);
        list[8] = new Item("Pasta 1kg", 0.50, 1.50, 20);
        list[9] = new Item("Coca Cola", 1, 2.10, 20);
        list[10] = new Item("Sprite", 1.10, 2.30, 20);
    }

    public static void printListC() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println("Product name :  " + list[i].getName() + "   Selling price :  " + list[i].getSellingPrice() + "   Quantity   " + list[i].getQuantity());
            }

        }
    }

    public void createItem() {
        boolean ok = false;
        System.out.println("Enter new product name :");
        name = kybd.nextLine();
        System.out.println("Enter buy price :");
        boughtPrice = kybd.nextDouble();
        kybd.nextLine();
        System.out.println("Enter selling price :");
        sellingPrice = kybd.nextDouble();
        kybd.nextLine();
        System.out.println("Enter quantity :");
        quantity = kybd.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (ok == false) {
                if (list[i] == null) {
                    list[i] = new Item(name, boughtPrice, sellingPrice, quantity);
                    ok = true;
                }

            }

        }
    }

    public static void printListM() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println("Product name :  " + list[i].getName() +"    Bought price : " + list[i].getBoughtPrice() + "    Selling price :  " + list[i].getSellingPrice() + "   Quantity   " + list[i].getQuantity());
            }

        }
    }

    public String getName() {
        return name;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
