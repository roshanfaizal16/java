import java.util.*;
public class Overloading {
    static Scanner in = new Scanner(System.in);
    static void area(int a){
        System.out.println("Enter side :");
         a = in.nextInt();
        int Area = a*a;
        System.out.println("Area of square:"+Area);
    }
    static void area(int a,int b){
        System.out.println("Enter side and breadth");
        a = in.nextInt();
        b = in.nextInt();
        int Area = a*b;
        System.out.println("Area of Rectangle:"+Area);
    }
    static void area(int a,double pi){
        System.out.println("Enter radius:");
        a = in.nextInt();
         double Area = pi*a*a;
            System.out.println("Area of circle:"+Area);
    }
    public static void main(String[] args) {
        double pi = 3.14;
       
      area(5);
      area(5, 10);
      area(5,pi);
    }
}
