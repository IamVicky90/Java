
package array1;

public class Array1 {
    public static void main(String[] args) {
        int uneven[][]={{1,9,4},{0,2},{0,1,2,3,4}};
        for(int i=0;i<uneven.length;i++){
            System.out.print("Row" +i+": ");
            for(int j=0;j<uneven[i].length;j++){
                System.out.print(uneven[i][j]+" ");
            }
            //System.out.println("");
        }
    }
    
}
