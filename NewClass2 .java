
import java.sql.*;

public class Hellno
{
    public static void main(String args[])
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData metaData = null;
        int numberOfColumns = 0;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/login" ,"root","");
            statement = connection.createStatement();
            System.out.println("Connection Established");
            resultSet = statement.executeQuery("SELECT * FROM username");
            metaData = resultSet.getMetaData();
            numberOfColumns = metaData.getColumnCount();
            for(int i=1 ; i<=numberOfColumns ; i++)
            {
                System.out.printf("%-8s\t",metaData.getColumnName(i));
            }
            System.out.println();
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            statement.close();
            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
        
    
}
