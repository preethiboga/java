import java.sql.*;
public class A
{
    public static void main(String[] args)
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","cse305");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from sailors");
        while(rs.next())
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      
    }
    
   
}