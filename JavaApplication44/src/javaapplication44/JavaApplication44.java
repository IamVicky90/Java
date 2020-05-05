//By Muhammad Waqas
package javaapplication44;
import java.util.Scanner;
class vicky{
int a=8;
int b=10;
vicky(int a,int b){
int c=a+b;
int d=this.a+this.b;
    System.out.println("Answer Without this is "+c);
    System.out.println("Answer With this is "+d);
}
}
public class JavaApplication44 {


    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        vicky obj=new vicky(a,b);
        
    }
    
}
