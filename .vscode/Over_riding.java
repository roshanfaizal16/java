import java.util.*;
public class Over_riding {
     protected double area;

     public static void main(string_opration[] args) {
         circle m = new circle();
         m.calculate();
         square n = new square();
         n.calculate();   
     }
    }
    class circle extends Over_riding{
        private double r;
                protected void calculate(){
                  Scanner in = new Scanner (System.in);
                  System.out.print("Enter radius:");
                  r = in.nextDouble();
                  double area = 3.14*r*r;
                  System.out.println(area);
            }
    }
    class square extends Over_riding{
        private int s;
                protected void calculate(){
                  Scanner in = new Scanner (System.in);
                  System.out.print("Enter side:");
                  s = in.nextInt();
                  int area = s*s;
                  System.out.println(area);
            }
    }



