abstract class outer {
    abstract  void outer_method();
    void outer_disp(int a,int b){
        int c = a+b;
        System.out.println("Sum:"+c);
    }
    abstract class inner{
        abstract void inner_method();
        void inner_disp(int a,int b){
           int d = b-a;
           System.out.println("Difference :"+d);
        }
    }
}
public class abstract_test extends outer{
    public void outer_method(){
        System.out.println("Inside outer abstract class");
    }
    class inner_test extends inner{
        public void inner_method(){
            System.out.println("Inside inner abstract method");
        }
    }
    
    public static void main(String[] args) {
        abstract_test m = new abstract_test();
        m.outer_method();
        m.outer_disp(5, 10);
        abstract_test.inner_test n = m.new inner_test();
        n.inner_method();
        n.inner_disp(5,10);
    }
}
