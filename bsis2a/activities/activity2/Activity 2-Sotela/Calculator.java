package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {
        
        Scanner calculator= new
        Scanner(System.in);
        float num1, num2, answer;
        System.out.println("enter first number:");
        num1=calculator.nextFloat();
        
        System.out.println("enter second number:");
        num2=calculator.nextFloat();
        
        answer=num1+num2;
        
       System.out.println("the sum is:"+answer);
       
       answer=num1-num2;
       System.out.println("the difference is:"+answer);
       
       answer=num1*num2;
       System.out.println("the product is:"+answer);
       
       answer=num1/num2;
       System.out.println("the quotient is:"+answer);
       
       answer=num1%num2;
       System.out.println("the remainder of two number is:"+answer);
        
    }
    
}
