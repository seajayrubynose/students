package printanswer;
import java.util.Scanner;
public class PrintAnswer {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print(num1 + "+" + num2 + "=" + (num1+num2) + "\n");
        System.out.print(num1 + "*" + num2 + "=" + (num1*num2) + "\n");
        System.out.print(num1 + "-" + num2 + "=" + (num1-num2) + "\n");
        System.out.print(num1 + "/" + num2 + "=" + (num1/num2) + "\n");
        System.out.print(num1 + "%" + num2 + "=" + (num1%num2) + "\n");
    }
}
