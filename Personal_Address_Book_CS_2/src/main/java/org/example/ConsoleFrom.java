package org.example;

import org.example.controller.AddressController;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleFrom {

    private Scanner scanner = new Scanner(System.in);
    private AddressController addressController = new AddressController();

    public void mainFrom() {
        System.out.println("Welcome To Personal Address Book     order by:Redemption");
        System.out.println("");
        System.out.println("1. Select All Address!");
        System.out.println("2. Select Address By Id!");
        System.out.println("3. Insert Address!");
        System.out.println("4. Update Address!");
        System.out.println("5. Delete Address By Id!");
        System.out.println("6. exit!");
        int checkid = scanner.nextInt();

        try{
            new ProcessBuilder("cmd", "'/k'","cls");
        }catch (Exception e){
            e.printStackTrace();
        }
        switch (checkid) {
            case 1:
                addressController.QueryAllAddress();
                break;
            case 2:
                addressController.QueryAddressById();
                break;
            case 3:
                addressController.insertAddress();
                break;
            case 4:
                addressController.updateAddress();
                break;
            case 5:
                addressController.deleteAddressById();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Please input a right id!");

        }
        System.out.println("Please press \"Enter\" to continue!");
        scanner.nextLine();
        scanner.nextLine();
        mainFrom();
    }
}
