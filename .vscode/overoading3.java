

public class overoading3 {
    public static void main(String[] args) {
        calculate();
        calculate(5.5,7.5);
        calculate(10,5);
        calculate(7, 6);
    } 
    static void calculate(int a,int b){
        System.out.println("Sum:"+(a+b));
    }
    static void calculate(double a,double b){
        System.out.println("Difference:"+(b-a));
    }
    static void calculate(float c,float d){
        System.out.println("Product:"+(c*d));
    }
    static void calculate(){
        int m = 10,n = 5;
        System.out.println("Division:"+(m/n));
    }
}
