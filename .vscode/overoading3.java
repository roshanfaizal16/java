public class overoading3 {
    public static void main(String[] args) {
        calculate();
        calculate(5.5,7.5);
        calculate(10,5);
        calculate(10, 5);
    }
    static void calculate(int a,int b){
        System.out.println("Sum:"+(a+b));
    }
    static void calculate(double a,double b){
        System.out.println("Difference:"+(b-a));
    }
    static void calculate(float a,float b){
        System.out.println("Product:"+(a*b));
    }
    static void calculate(){
        int m = 10,n = 5;
        System.out.println("Division:"+(m/n));
    }
}
