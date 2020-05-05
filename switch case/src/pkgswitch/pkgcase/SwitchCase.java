
package pkgswitch.pkgcase;

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("QAMAR SIAL");
        char grade='g';
        int marks =40;
        switch(grade)
        {
            case 'a':
                System.out.println("good result");
                break;
            case 'b':
                System.out.println("not a good marks");
                break;
            case 'c':
                System.out.println("just pass butt nat a good marks");
                break;
            case 'd':
                System.out.println("bad result");
                break;
            case 'e':
                System.out.println("Near to fail");
                break;
            case 'f':
                System.out.println("fail in this subject");
                break;
                
            case 'g':
            {
            if(marks<50 && marks>0)
                    System.out.println("DI from comsats univeresity islamabad,(sahiwal campus)");
            else
                    System.out.println("good result");
            }
            break;
        }}
    }
    

