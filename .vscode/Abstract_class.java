
import java.util.Scanner;

abstract class Circle {
    protected double area;
    abstract void cal_area();
}
 class Abstract_class extends Circle{
       private double a;
   public void Abstrct_class(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
         a = in.nextInt();
   }
   protected void cal_area(){
    area = 3.14*a*a;
    System.out.println("area:"+area);
   }
   public static void main(string_opration[] args) {
       Abstract_class m = new Abstract_class();
       m.Abstrct_class();
       m.cal_area();
   }
}
