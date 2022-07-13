package com.platzi.app_message;

import java.sql.Connection;
import java.sql.DriverManager;

public class JavaConnection {

    public Connection getConnection() {
        Connection con = null;
        String userName = "andres";
        String password = "Colombia1*++";
        StringBuilder connectionString = new StringBuilder();
        connectionString.append("jdbc:mysql://localhost:3306/");
        String dataBaseName = "menssages";
        String connectionStringAdds = "?serverTimezone=UTC";

        try {
            con = DriverManager.getConnection(connectionString.append(dataBaseName).append(connectionStringAdds).toString(), userName, password);
            if (con != null) System.out.println("Connection successfully!");
        } catch (Exception e) {
            System.out.println("An error has occurred" + e);
        }

        return con;
    }

}
