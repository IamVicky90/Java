
package arrays2;

public class Arrays2 {
    public static void main(String[] args) {
        
        /*int a[][]=new int[4][5];
        for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
            a[i][j]= 
        }
        }*/
        int twoD[][]= new int[4][5]; 
        int i, j, k = 0; 
        for(i=0; i<4; i++) {
        for(j=0; j<5; j++) { twoD[i][j]=k;
        k++;
        }} 
        for(i=0; i<4; i++) { 
        for(j=0; j<5; j++) 
        System.out.print(twoD[i][j] + " "); 
        System.out.println(); }
        }
        
        
    }
    
}
