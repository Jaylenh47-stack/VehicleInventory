package com.pluralsight;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Vehicle[] inventory = new Vehicle[20];

    public static void main(String[] args){

        int quantityOfVehicles;

        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        inventory[6]  = new Vehicle(101127, "Nissan Altima", "Gray", 82000, 6800);

        //ToDo loop this menu until the user inputs 6
        //loop the menu for the user to select from
        System.out.println("What do you want to do\n");
        System.out.println("1 - List all vehicles");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 -Search by color");
        System.out.println("5 - Add a vehicle");
        System.out.println("6 - Quit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                listAllVehicles();
                break;
            case 2:
                makeModelSearch();
                break;
            case 3:
                priceSearch();
                break;
            case 4:
                colorSearch();
                break;
            //ToDO case 5 and 6
        }






    }
    //ToDo make these print statements into display() method in ConsoleHelper
    private static void listAllVehicles(){
        for (Vehicle i: inventory){
            if (i == null){
                continue;
            }
            System.out.println(i.getVehicleID() + " " + i.getMakeModel() + " " + "$" + i.getPrice() + " " + i.getColor());
        }
    }

    private static void makeModelSearch(){
        System.out.print("Enter the make and/or model you are searching for");
        String search = scanner.nextLine();


        for (Vehicle i : inventory){
            if (i == null){
                continue;
            }
            if (i.getMakeModel().toLowerCase().contains(search.toLowerCase())) {
                System.out.println(i.getVehicleID() + " " + i.getMakeModel() + " " + "$" + i.getPrice() + " " + i.getColor());
            }
        }
    }

    private static void priceSearch(){
        System.out.print("Enter the minimum price of the vehicles you want to see");
        int  searchMin = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the maximum price of the vehicles you want to see");
        int  searchMax = scanner.nextInt();
        scanner.nextLine();

        for (Vehicle i : inventory){
            if (i == null){
                continue;
            }
            if (searchMin <= i .getPrice() && searchMax >= i.getPrice()) {
                System.out.println(i.getVehicleID() + " " + i.getMakeModel() + " " + "$" + i.getPrice() + " " + i.getColor());
            }
        }
    }

    private static void colorSearch(){
        System.out.print("Enter the color of the vehicle you are searching for");
        String search = scanner.nextLine();

        for (Vehicle i : inventory){
            if (i == null){
                continue;
            }
            if (i.getColor().toLowerCase().contains(search.toLowerCase())) {
                System.out.println(i.getVehicleID() + " " + i.getMakeModel() + " " + "$" + i.getPrice() + " " + i.getColor());
            }
        }
    }



}
