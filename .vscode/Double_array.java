
import java.util.Scanner;

public class Double_array {
    public static void main(string_opration[] args) {
        array();
    }
    static void array(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rows and coloumns of array:");
        int n = in.nextInt();
        int m = in.nextInt();
       int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
               arr[i][j]=in.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
