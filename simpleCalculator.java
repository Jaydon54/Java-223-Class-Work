package chap5quest55;
import java.util.Scanner;

/**
 *
 *
 * @author jaydo
 */
public class Chap5Quest55 
{
    public static void main(String[] args) 
    {
        // Scanner + Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers from 0-9");
        int num1 = scan.nextInt();
        if (num1 > 9 || num1 < 0)
        {
            System.out.println("Invalid Number, enter a number from 0-9");
            num1 = scan.nextInt();
        }
        
        int num2 = scan.nextInt();
        if (num2 > 9 || num2 < 0)
        {
            System.out.println("Invalid Number, enter a number from 0-9");
            num2 = scan.nextInt();
        }
        
        System.out.println("Which operation is being performed (+,-,*,/,^)");
        char operator = scan.next().charAt(0);
        
        // Convert numbers to words
        String num1Str = intToStr(num1);

        String num2Str = intToStr(num2);
        
        // convert char to string
        String operatorStr = String.valueOf(operator);
        // then find out what operation is being done and do it
        switch (operatorStr) {
            case "+" : {
                int sum = num1 + num2;
                System.out.println(num1Str + " plus " + num2Str + " is " + sum);
            }
            case "-" : {
                int difference = num1 - num2;
                System.out.println(num1Str + " minus " + num2Str + " is " + difference);
            }
            case "*" : {
                int product = num1 * num2;
                System.out.println(num1Str + " multiplied by " + num2Str + " is " + product);
            }
            case "/" : {
                double quotient = (double) num1 / num2;
                if (num2 == 0){
                    System.out.println("Error: devision by zero");
                }
                else{
                    System.out.println(num1Str + " devided by " + num2Str + " is " + quotient);
                }
            }
            case "^" : {
                double pow = Math.pow(num1, num2);
                System.out.println(num1Str + " to the power " + num2Str + " is " + pow);
            }
            default : {}
        }
        
    }
   
    
    // This Method converts int 0-9 to word
    public static String intToStr(int num)
    {
        switch (num) {
            case 0 -> {
                return "zero";
            }
            case 1 -> {
                return "one";
            }
            case 2 -> {
                return "two";
            }
            case 3 -> {
                return "three";
            }
            case 4 -> {
                return "four";
            }
            case 5 -> {
                return "five";
            }
            case 6 -> {
                return "six";
            }
            case 7 -> {
                return "seven";
            }
            case 8 -> {
                return "eight";
            }
            case 9 -> {
                return "nine";
            }
            default -> {
            return " ";
            }
        }
    }
    
}
