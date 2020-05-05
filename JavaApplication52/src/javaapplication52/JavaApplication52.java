package javaapplication52;
import javax.swing.*;
import java.util.Scanner;
class vicky{
int a,b;
vicky(String n){
    System.out.println(n);
    
}
int func(){
return this.a +this.b;
}
void add(int a,int b){
int c=a+b;
    System.out.println("Sum is:"+c);
    this.a=a;
    this.b=b;
    
}
void sub(int a,int b){
    int c=a-b;
    System.out.println("Sub is:"+c);
}void mul(int a,int b){
    int c=a*b;
    System.out.println("Sub is:"+c);
}void div(int a,int b){
    int c=a/b;
    System.out.println("Sub is:"+c);
}
}

public class JavaApplication52 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=JOptionPane.showInputDialog("Enter a for Scanner\n Enter b for JOptionPane");
        char Ch=str.charAt(0);
        String n="My name is Waqas";
        vicky obj=new vicky(n);
        
        switch(Ch){
            case 'a':
                System.out.println("Enter first number ");
                int a =input.nextInt();
                System.out.println("Enter second number ");
                int b=input.nextInt();
                obj.add(a,b);
                obj.sub(a,b);
                obj.mul(a,b);
                obj.div(a,b);
                int r=obj.func();
                System.out.println("Function is :3"
                        + ""+r);
                break;
            case 'b':
                String str1=JOptionPane.showInputDialog("Enter first number");
                int c=Integer.parseInt(str1);
                String str2=JOptionPane.showInputDialog("Enter second number");
                int d=Integer.parseInt(str2);
                obj.add(c,d);
                obj.sub(c,d);
                obj.mul(c,d);
                obj.div(c,d);
              r=obj.func();
                System.out.println("Function "+r);
        }}}
