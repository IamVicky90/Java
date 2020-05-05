
package pkg19.date.lab.practice;
import java.util.Scanner;
public class DateLabPractice {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the case number");
        int Case=input.nextInt();
        switch(Case){
            case 1:
                System.out.println("Enter the Area");
                int Area=input.nextInt();
                double S=Area/3.14;
                
                double rad=Math.sqrt(S);
                System.out.println("Radius is: "+rad);
                break;
            case 2:
                System.out.println("Enter Two numbers");
                int a=input.nextInt();
                int b=input.nextInt();
                int Sum=a+b;
                System.out.println(Sum);
                break;
            case 3:
                System.out.println("Enter 2 numbers");
                int c = input.nextInt();
                int d=input.nextInt();
                if(c>d){
                    System.out.println(c+" is greater than "+ d);
                    
                }
                if(d>c){
                    System.out.println(d+" is greater than "+ c);
                    
                }
                break;
            case 4:
                System.out.println("Enter a number");
                int e=input.nextInt();
                System.out.println("The postfix of "+ e +" is "+ e++);
                System.out.println("The postfix of "+ e +" is "+ ++e);
                break;
            case 5:
                System.out.println("Enter your name");
                String name=input.nextLine();
                System.out.println(name);
                break;
            default:
                System.out.println("SHOW INVALID DEFAULT");
                break;
    
        }
    }
    
}
