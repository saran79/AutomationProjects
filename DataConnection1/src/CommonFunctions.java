import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class CommonFunctions {
    String productName;
    int productId;
    String productDesc;
    String productPrice;
    public void dataConnectivity() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testproductdb","root","");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("Select * from product");
        while(rs.next()){
            productId = rs.getInt(1);
            productName = rs.getString(2);
            productDesc = rs.getString(3);
            productPrice = rs.getString(4);
            System.out.println( productId+ " "+productName+" "+productDesc+" "+productPrice);
        }
        connection.close();
    }
    public static void main(String[] args) throws Exception {
        CommonFunctions commonFunctions = new CommonFunctions();
        commonFunctions.dataConnectivity();
    }
}


