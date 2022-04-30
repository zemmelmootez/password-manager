package passwordmanager;

import java.sql.ResultSet;
import java.sql.SQLException;

class actor {
    String email;
    String password;
    static int num;
    int id;


    public void Signup(String email,String password)  {
        this.email=email;
        this.password=password;
        try {
            String sql = "INSERT INTO actor (email,password) " +
                    "VALUES ('"+email+"','"+password+"')";
           // test.s.executeUpdate(sql);
            System.out.println(test.s.executeUpdate(sql));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void  remove_social(String email, String name)
    {
       // System.out.println("DELETE FROM social_account where email='"+email+"'");
       try {
          String sql ="DELETE FROM social_account where email='"+email+"' and name='"+name+"'";
           test.s.executeUpdate(sql);

           // System.out.println(test.s.executeUpdate(sql));
        }
        catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
