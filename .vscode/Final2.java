
abstract class  Final1 {
    final double pi ;
    static int r;
     Final1(){
        this.pi = 3.14;
    }
    static void ins(){
      r = 3254535;
      System.out.println("Value of r:"+r);
    }
    }
    final class Final2 extends Final1{
        static void fan(){
            System.err.println("Hello");
        }
        public static void main(string_opration[] args) {
       Final2 m = new Final2();
       System.out.println(m.pi);
       ins();
       fan();
        }
    }

