
import java.util.Scanner;

public class Function_basics {
    Scanner in = new Scanner(System.in);
    public void Details(){
        
        
        System.out.print("Enter Student name:");
        String s = in.nextLine();
        System.out.print("Enter student ID:");
         long n = in.nextInt();
         System.out.println("Name: "+s);
         System.out.println("ID: "+n);
    }
    public static void main(String[] args) {
        Function_basics std= new Function_basics();
        std.Details();
    }
}
