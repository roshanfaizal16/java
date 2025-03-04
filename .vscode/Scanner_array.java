
import java.util.Scanner;

public class Scanner_array {
    public static void main(string_opration[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i <n; i++) {
            arr[i] = in.nextInt();  
        }
        System.out.println("Array elements are:");
        for (int k:arr){
           System.out.print(k+ " ");
        }
        }
    }

