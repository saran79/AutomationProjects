package functionsLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CommonFunctions {

       String productName;
    public void dataConnectivity() throws Exception{

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testprodcutdb","root","");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("Select name from products");
         while(rs.next()){
           productName = rs.getString(1);
             System.out.println(productName);
         }
        connection.close();

    }

    public static void main(String[] args) throws Exception {
        CommonFunctions commonFunctions = new CommonFunctions();
        commonFunctions.dataConnectivity();
    }
}
