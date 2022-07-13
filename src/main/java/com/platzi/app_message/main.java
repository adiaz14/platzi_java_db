package com.platzi.app_message;

import java.sql.Connection;

public class main {

    public static void main(String[] args) {

        JavaConnection newCon = new JavaConnection();

        try {
            newCon.getConnection();
        }catch (Exception e){
            System.out.println("An error has occurred " + e);
        }

    }

}
