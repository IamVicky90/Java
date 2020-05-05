
package date19labpractice2;
import javax.swing.*;
import java.lang.String;
public class Date19labpractice2 {

    public static void main(String[] args) {
       // JFrame=new JFrame("");
        String s=JOptionPane.showInputDialog("To Compare String Enter 1\nToPerform All Arathematic OperationsEnter 2\nTo find Compound Operator Enter 3\nTo find area enter 4\nTo know equal numbers enter 5 ");
        int ch=Integer.parseInt(s);
        if(ch==1){
        String s1=JOptionPane.showInputDialog("Enter the first string");
        String s2=JOptionPane.showInputDialog("Enter the second string");
        JOptionPane.showMessageDialog(null,s1+s2,"Result is ",JOptionPane.INFORMATION_MESSAGE);}
        else if(ch==2){
        String a=JOptionPane.showInputDialog("Enter first number");
        int nm1=Integer.parseInt(a);
           String b=JOptionPane.showInputDialog("Enter second number");
        int nm2=Integer.parseInt(b);
        int nm3=nm1+nm2;
        int nm4=nm1/nm2;
        int nm5=nm1*nm2;
        int nm6=nm1-nm2;
        JOptionPane.showMessageDialog(null,"Addition IS \n"+ nm3 + "\nSubtraction is "+nm6+"\nDivision is \n"+ nm4+ "\nMultiplication is \n"+nm5,"Messege!",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(ch==3){
        String cmp=JOptionPane.showInputDialog("Enter a number to find its compound operator");
        int compound=Integer.parseInt(cmp);
        int y=compound+50;
        JOptionPane.showMessageDialog(null,"REsult is "+y,"Message!",JOptionPane.INFORMATION_MESSAGE);}
        else if(ch==4){
        String st4=JOptionPane.showInputDialog("Enter radius");
        int rad=Integer.parseInt(st4);
        double Area=3.14*rad*rad;
        JOptionPane.showMessageDialog(null,"Area of circle is "+Area,"Message!",JOptionPane.INFORMATION_MESSAGE);}
        else if(ch==5){
        String st5=JOptionPane.showInputDialog("Enter first numbers");
        int nm1=Integer.parseInt(st5);
        String st6=JOptionPane.showInputDialog("Enter first numbers");
        int nm2=Integer.parseInt(st6);
        String st7=JOptionPane.showInputDialog("Enter first numbers");
        int nm3=Integer.parseInt(st7);
        if(nm1==nm2){
        if(nm3==nm1){
        JOptionPane.showMessageDialog(null, "Equal numbers ","Information!",JOptionPane.INFORMATION_MESSAGE);}
        else{
                 JOptionPane.showMessageDialog(null, "Numbers are not equal ","Information!",JOptionPane.INFORMATION_MESSAGE);}
        }
        else{
         JOptionPane.showMessageDialog(null, "Numbers are not Equal ","Information!",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        }else{
        JOptionPane.showMessageDialog(null,"Invalid Number","Vicky Error",JOptionPane.ERROR_MESSAGE);
        }
      
    }
    
}
