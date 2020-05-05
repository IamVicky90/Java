
package qamar;
import java.util.Scanner;

public class Qamar {

    
    public static void main(String[] args) {
     int a,b,c,d;
//int grade;
Scanner i=new Scanner(System.in);
        System.out.println("Enter your grade");
        a=i.nextInt();
        switch(a)
        {
            case 90:
                if(a>=90 && a>100)
                {
                    System.out.println("your Grade Is A+");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
            case 85:
                if(a>=85 && a<90)
                {
                    System.out.println("Your grade is A");
                }
                else
                {
                    System.out.println("Invalid number");
                }
                break;
            case 80:
                if(a>=80 && a<85)
                {
                    System.out.println("Your Grade Is A-");
                }
                else
                {
                    System.out.println("Invalid number");
                }
                break;
            case 75:
                if(a>=75 && a<80)
                {
                    System.out.println("Your Grade Is B+");
                }
                    else
                    {
                        System.out.println("Invalid number");           
                    }
                break;
            case 70:
                if(a>=70 && a<75)
                {
                    System.out.println("Your Grade Is B");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
             case 65:
                if(a>=65 && a<70)
                {
                    System.out.println("Your Grade Is c");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
                 case 60:
                if(a>=60 && a<65)
                {
                    System.out.println("Your Grade Is D");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
                 case 55:
                if(a>=55 && a<60)
                {
                    System.out.println("Your Grade Is E+");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
                 case 50:
                if(a>=50 && a<55)
                {
                    System.out.println("Your Grade Is E");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
                 case 45:
                if(a>=1 && a<50)
                {
                    System.out.println("Your Are Fail");
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                break;
        }}
    
}
