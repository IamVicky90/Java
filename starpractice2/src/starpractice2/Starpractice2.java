
package starpractice2;

public class Starpractice2 {
    public static void main(String[] args) {
        /*char First='A', Last='F';
        for(int i=1;i<=(Last-'A'+1);i++){
        for(int j=1;j<=i;j++){
            System.out.print(First);
        }First++;System.out.println("");
        }*/
        	for (int i = 1; i < 6; i++) {
		for (int j = i; j < 6; j++) {
			                 System.out.print(" ");
		}for (int k = 1; k <=i; k++) {
			                 System.out.print(" *");
		}System.out.println("");
		
	}
	for (int u = 1; u < 6; u++) {
		for (int y = 1; y <= u; y++) {
			                 System.out.print(" ");
		}for (int p = 5; p >=u; p--) {
			         System.out.print(" *");
		}System.out.println("");
	}
}}
