package passwordmanager;

import com.mysql.cj.log.Log;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
public class test {
static  Connection c;
static Statement s;
static  ResultSet rs;
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        /* MessageDigest instance for hashing using SHA256 */
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        /* digest() method called to calculate message digest of an input and return array of byte */
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash)
    {
        /* Convert byte array of hash into digest */
        BigInteger number = new BigInteger(1, hash);

        /* Convert the digest into hex value */
        StringBuilder hexString = new StringBuilder(number.toString(16));

        /* Pad with leading zeros */
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }


    public static void connection(){
        try {
             c= DriverManager.getConnection(
                    "jdbc:mysql://localhost/javaproject",
                    "admin",
                    "admin"
            );
            System.out.println("ok !");
             s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        connection();
        actor a=new actor();

       // a.remove_social("zemmel.mootez@gmail.com","facebook");
        Login.main();
     //   a.login();
        String ch= "ela";
        //hash
        System.out.println(getSHA(ch));
        System.out.println(toHexString(getSHA(ch)));
    }

}
