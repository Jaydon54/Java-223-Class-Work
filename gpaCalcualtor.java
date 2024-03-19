package javamidterm5;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Calculates average grade and GPA from five class grades
 *  
 * @author jaydo
 */
public class JavaMidterm5 
{

    public static void main(String[] args) 
    {
        // Get input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numeric grades");
        int grade1 = scan.nextInt();
        int grade2 = scan.nextInt();
        int grade3 = scan.nextInt();
        int grade4 = scan.nextInt();
        int grade5 = scan.nextInt();
        
        // calculate total grade
        int sum = grade1 + grade2 + grade3 + grade4 + grade5;
        double avg = sum / 5.0;
        
        double GPA = (avg / 100.0) * 4.0;
        
        
        // output result
        
        System.out.println("Your average grade is " + avg + "%");
        System.out.println("And your GPA is " + GPA);
    }
    
}
