package question2;
import javax.swing.*;
public class Question2 {

    public static void main(String[] args) {
        String Phone_no=JOptionPane.showInputDialog("Enter the Phone number");
        
        if(Phone_no.length()==12){
        if(Phone_no.charAt(0)=='+'){
        if(Phone_no.charAt(1)=='9'){
        if(Phone_no.charAt(2)=='2'){
                  if(Phone_no.charAt(3)=='4'){
        if(Phone_no.charAt(4)=='2'){
            System.out.println("City is Lahore");
            
        }else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}  
        }else{
            System.out.println("Invalid number");}
        }
        else if(Phone_no.charAt(0)=='+'){
        if(Phone_no.charAt(1)=='9'){
        if(Phone_no.charAt(2)=='2'){
                  if(Phone_no.charAt(3)=='5'){
        if(Phone_no.charAt(4)=='1'){
            System.out.println("City is Islamabad");
        }else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}
        }  else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}
        }
        else if(Phone_no.charAt(0)=='+'){
        if(Phone_no.charAt(1)=='9'){
        if(Phone_no.charAt(2)=='2'){
                  if(Phone_no.charAt(3)=='2'){
        if(Phone_no.charAt(4)=='1'){
            System.out.println("City is Karachi");
        }else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}
        }  else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}
        }else{
            System.out.println("Invalid number");}}
        
    }
    

