import java.util.Scanner;
public class Add {
    public int a,b,c;
   /*public void display(){
    System.out.print("Sum of tw numbers:"+c);
   }*/
    private void sum(){
        Scanner in = new Scanner(System.in);
     System.out.println("Enter value of a:");
        a = in.nextInt();
    System.out.println("Enter value of b:");
    b = in.nextInt();
    c = a+b;
    System.out.println("Sum of two numbers:"+c);
    }
    public void disp(){
        sum();
    }
}
class addition{
    public static void main(String[] args) {
        Add obj = new Add();
        obj.disp();
    }
}  

