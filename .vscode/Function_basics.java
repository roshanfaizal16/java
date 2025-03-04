
import java.util.Scanner;

public class Function_basics {
    Scanner in = new Scanner(System.in);
    public void Details(int m){
        string_opration[] name=new string_opration[m];
        int[] ida = new int[m]; 
        System.out.print("Enter Student name:");
        for(int i  = 0;i<m;i++){ 
        name[i]= in.nextLine(); 
    }
        System.out.print("Enter student ID:");
        for(int i  = 0;i<m;i++){
            ida[i]= in.nextInt();
        }
         for(string_opration  z:name){
         System.out.print(z+" ");
         }
         System.out.println();
         for(int b:ida){
         System.out.print(b+" ");
         }
    }
    public static void main(string_opration[] args) {
        Function_basics std= new Function_basics();
        std.Details(5);
    }
}
