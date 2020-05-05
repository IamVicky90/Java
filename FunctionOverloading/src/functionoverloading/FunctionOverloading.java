package functionoverloading;
import java.util.Scanner;
import javax.swing.*;
public class FunctionOverloading {
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter 1 to find max value\n Enter 2 to find min value\n Enter 3 to find reverse order");
        int ch=input.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter Two Numbers");
                int a=input.nextInt();
                int b=input.nextInt();
                int ans1 =nmbr(a,b);
                System.out.println(ans1);
            break;
        case 2:
        System.out.println("Enter Two Numbers");
        double c=input.nextDouble();
        double d=input.nextDouble();
        double ans=nmbr(c,d);
            System.out.println(ans);
            break;
        }
    } public static int nmbr(int a,int b){
        int max;
    if(a>b){
        
        max=a;
        
        
        
    }
    else{
        max=b;
    }
    return max;
    }
    public static double nmbr(double a,double b){
        double min;
    if(a>b){
        
        min=b;
        
    }
    else{
    min=a;
    }
    return min;
    
    }}