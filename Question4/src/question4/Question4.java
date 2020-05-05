
package question4;
import javax.swing.*;
public class Question4 {
    
public static void func(String str,String Str1){
String[] auth=new String[]{"Junaid","Faiz","Hali","Qasim"};
        String[] title=new String[]{"Zindagi","Love","Safar-Nama","Motivation"};
        int[] price=new int[]{300,400,100,355};
        String[] Publisher=new String[]{"Lahore Book","Azam Khan","Grammer School","Star Group"};
        int[] Stock=new int[]{5,6,7,3};
        for(int i=0;i<title.length;i++){
        if(auth[i].equals(Str1) && title[i].equals(str)){
        JOptionPane.showMessageDialog(null, "Details is"+"Its price is: "+price[i]+" its Publisher is: "+Publisher[i]+" Stock Available is: "+Stock[i],"Information Message",JOptionPane.INFORMATION_MESSAGE);
        break;}
        
        }
        JOptionPane.showMessageDialog(null, "Sorry this is unavailable ","Error",JOptionPane.ERROR_MESSAGE);
        
       
}

    public static void main(String[] args) {
        
        String str=JOptionPane.showInputDialog("Enter the Name of Title");
        String str1=JOptionPane.showInputDialog("Enter the Name of Author");
        func(str,str1);
        
    }
    
}
