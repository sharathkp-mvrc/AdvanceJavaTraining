package com.example.warehouse;

import java.util.Scanner;

public class Warehouse extends Inventory{

    int numberOfProductsLimit,emptySpaces;
    int capacity,availableSpace;
    int valueOfCurrentInventory;

    public static void main(String[] args){
        System.out.println("Welcome to WareHouse");
        System.out.println("1] View Inventory \t 2] View Products \t 3] Add Products \t 4] Remove Product");
        Scanner scan=new Scanner(System.in);
        int key=scan.nextInt();
        switch (key){
            case 1:
                System.out.println("Inventory");
                break;
            case 2:
                System.out.println("Products");
                break;
            case 3:
                System.out.println("Enter Product Details : ");
                Products add=new Products();
                System.out.println("Enter Product type");
                add.setProductType(scan.nextLine());
                System.out.println("Enter Product description");
                add.setProductDescription(scan.nextLine());
                System.out.println("Enter Product prize");
                add.setProductPrize(scan.nextInt());
                break;
            case 4:
                System.out.println("Remove");
                break;
            default:
                System.out.println("Please Choose ...");
         }
    }

    public void updateInventory(){

    }

}
