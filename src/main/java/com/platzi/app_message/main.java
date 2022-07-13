package com.platzi.app_message;

import java.sql.Connection;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //Object to capture option from users
        Scanner scan = new Scanner(System.in);

        //Menu
        int option = 0;

        do{
            //Options
            System.out.println("------------------------\n");
            System.out.println("Message application");
            System.out.println("1. Create message");
            System.out.println("2. List of messages");
            System.out.println("3. Edit messages");
            System.out.println("4. Delete messages");
            System.out.println("5. Exit");

            //read user option
            option = scan.nextInt();

            switch(option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.getListMessage();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                System.out.println("Closing app!");
                    break;
            }

        }while(option != 5);

        //Instance db connection
        JavaConnection newCon = new JavaConnection();

        try {
            //Test connection
            newCon.getConnection();
        }catch (Exception e){
            System.out.println("An error has occurred " + e);
        }

    }

}
