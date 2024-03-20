package chap5quest47and48;
import java.util.Scanner;
import java.math.*;

/**
 * Takes a username and password, username input is validated by making sure length is btw 
 * 6-10, password is entered twice for validation.
 * 
 * @author jaydo
 */
public class Chap5Quest47And48 
{

    public static void main(String[] args) 
    {
        // Make scanner
        Scanner scan = new Scanner(System.in);
        
        // Username
        System.out.println("Enter User ID:");
        String userID = scan.nextLine();
        
        // Password
        System.out.println("Enter Password:");
        String password1 = scan.nextLine();
        System.out.println("Enter Password Again:");
        String password2 = scan.nextLine();
        
        // Make sure passwords match
        
        boolean p1EqualsP2 = password1.equals(password2);
        boolean validUserID = (userID.length() > 5 && userID.length() < 11);
        if (p1EqualsP2 && validUserID)
        {
            System.out.println("Welcome, " + userID + " , you are now registered as a new user.");
        }
        else if (!(p1EqualsP2))
        {
            System.out.println("Sorry, there is a typo in your password.");
        }
        else
        {
            System.out.println("Sorry, user ID invalid.");
        }
                   
    }
    
}
