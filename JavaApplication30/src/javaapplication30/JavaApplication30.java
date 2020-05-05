
package javaapplication30;
import javax.swing.*;
public class JavaApplication30 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
   

   JFrame f = new JFrame("");
  String  operand1;

  
    operand1= JOptionPane.showInputDialog("Enter radius of circle: ");
    double a = Double.parseDouble(operand1);
    
      String choice = JOptionPane.showInputDialog("Enter 1  for  Area, 2 for circumference");
  int ch = Integer.parseInt(choice);
  if(ch==1)
  {

 double c=3.14*a*a;
 JOptionPane.showMessageDialog(f,"Area of Circle " +c);
 
                    
  } 
  else if(ch==2)
  {
      double m=2*3.14*a;
       JOptionPane.showMessageDialog(null, "Circumference of Circle " +m);
  }

else
  {
      JOptionPane.showMessageDialog(null,"Invalid","Error",JOptionPane.WARNING_MESSAGE);
  }
}
}
    
    
}}
