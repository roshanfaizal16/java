import java.util.Scanner;
public class Mark_convertor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks:");
        double m = in.nextInt();
        double res1 = m/1.66;
        System.out.println(res1);
    }
}
