package chap3quest73;
import java.util.Scanner;
import java.math.*;
import java.text.*;

/**
 *Calculates a monthly mortgage payment
 * compounded monthly
 * @author jaydo
 */
public class Chap3Quest73 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter interst rate as a decimal:");
        String intR = scan.next();
        double intRate = Double.parseDouble(intR);
        
        
        System.out.println("Enter number of years the mortgage will be held:");
        int nOY = scan.nextInt();
        
        System.out.println("Enter the ammount borrowed from the bank");
        int M = scan.nextInt();
        
        // Calculations
        double mIR = intRate / 12.0;
        double power = Math.pow((1 + mIR), (12*nOY));
        double mP = (mIR * M)/(1-(1/power));
        
        double tP = mP * 12 *nOY;
        
        double overpayment = (tP - M) / M;
        // Output
        NumberFormat f = NumberFormat.getCurrencyInstance();
        DecimalFormat percent = new DecimalFormat("0.00%");
        // Int rate
        System.out.println("Interst rate: " + percent.format(intRate));
        
        // Mortgage amonunt
        System.out.println("Mortgage amount: " + f.format(M));
        
        // Monthly payment
        System.out.println("Monthly payment: " + f.format(mP));
        
        // Total Payment
        System.out.println("Total payment: " + f.format(tP));
        
        // Overpayment
        System.out.println("Overpayment in dollars: " + f.format(tP - M));
        System.out.println("Overpayment in percent: " + percent.format(overpayment));
        
        
    }
    
}
