import  java.util.Scanner;
public class Calculator_methods {
    public int a,b,c;
    Scanner in = new Scanner(System.in);
    public void add(){
        a = in.nextInt();
        b = in.nextInt();
       c = a+b;
      System.out.println("Sum of two numbers:"+c);

    }
    public int difference(){
        a = in.nextInt();
        b = in.nextInt();
        c = b-a;
      return(c);
    }
    static  void product(int a,int b){
        int c = a*b;
        System.out.println("Product of two numbers"+c);
    }
    public int division(int a,int b){
        float c=b/a;
        return((int)c);
    }
    public static void main(string_opration[] args) {
        Calculator_methods obj = new Calculator_methods();
        obj.add();
        System.out.println("Difference of two numbers:"+obj.difference());
        obj.product(5,4);
        System.out.println("Division of two numbers:"+obj.division(6,97));
    }
}