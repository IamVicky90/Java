//by Muhammad Waqas
package labfunctionoverlading;
import javax.swing.*;
public class LabFunctionOverlading {
public static int vicky(int a,int b){
return a+b;
}
public static double vicky(double a,double b){
return a+b;
}
public static String vicky(String a){
return a;
}

    public static void main(String[] args) {
           String str1=JOptionPane.showInputDialog("Enter 1st number");
        int a=Integer.parseInt(str1);
           String str2=JOptionPane.showInputDialog("Enter 2nd number");
        int b=Integer.parseInt(str2);
        int sum=vicky(a,b);
        JOptionPane.showMessageDialog(null,"Sum is: "+sum,"Information Message",JOptionPane.INFORMATION_MESSAGE);
                   String str3=JOptionPane.showInputDialog("Enter 1st number");
        double c=Double.parseDouble(str3);
           String str4=JOptionPane.showInputDialog("Enter 2nd number");
        double d=Double.parseDouble(str4);
        double sum1=vicky(c,d);
        JOptionPane.showMessageDialog(null,"Subtraction is: "+sum1,"Information Message",JOptionPane.INFORMATION_MESSAGE);
        String str5=JOptionPane.showInputDialog("Enter the string");
        String str6=vicky(str5);
        JOptionPane.showMessageDialog(null, "String is "+ str6,"Information",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
