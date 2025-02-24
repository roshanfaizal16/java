import java.util.*;
abstract class Abstract_class2{
protected static double area;
protected  static double perimeter;
static int r;
static void circle_area(){
    Scanner in = new Scanner(System.in);
System.out.print("enter radius :");
r = in.nextInt();
    area = 3.14*r*r;
    System.out.println("Area:"+area);
}
static void circle_peri(){
    
    perimeter = 2*3.14*r;
    System.out.println("Perimeter:"+perimeter);
}
public static void main(String[] args) {
    circle_area();
    circle_peri();
}
}

