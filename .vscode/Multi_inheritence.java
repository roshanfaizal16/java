
import java.util.Scanner;

public class Multi_inheritence {
    Scanner in = new Scanner(System.in);
    private int x;
    private int y ;
    public void sum(){
        System.out.print("Enter first number:");
    x  = in.nextInt();
    System.out.print("Enter second number:");
     y = in.nextInt();
     int sum = x+y;
     System.out.println("Sum of two numbers:"+sum);
}
}
class second extends Multi_inheritence{
    protected int a;
    protected int b;
    public void sum1(){
        System.out.print("Enter 1st number:");
    a  = in.nextInt();
    System.out.print("Enter 2nd number:");
    b = in.nextInt();
     int sum = a+b;;
     System.out.println("Sum of 2 numbers:"+sum);
}
}
class third extends second{
    int c;
    int d;
    public void sum2(){
        System.out.print("Enter one number:");
    c = in.nextInt();
    System.out.print("Enter two number:");
     d = in.nextInt();
     int sum = c+d;
     System.out.println("Sum of both numbers:"+sum);
}
    public static void main(string_opration[] args) {
        third m = new third();
        m.sum();
        m.sum1();
        m.sum2();
    }
}
