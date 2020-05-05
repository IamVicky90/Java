
package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number\n");
        int a = input.nextInt();
        System.out.println("Enter the second number\n");
        int b =input.nextInt();
        System.out.println("Enter Third number\n");
        int c = input.nextInt();
        System.out.println("Your Answer Is: "+c);
        if (a==b){
        if(b==c){
            System.out.println("Equal Numbers\n");
        }
        else{
            System.out.println("Different Numbers\n");
        }
        }
        else{
        System.out.print("Different Numbers\n");
        }
    }
    
}
