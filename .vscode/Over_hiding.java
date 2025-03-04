public class Over_hiding {
      public static void main(string_opration[] args) {
          Super m = new Sub();
          m.display();
      }
    }

      class Super{
          static void display(){
            System.out.println("In super class");
          }
      }
      class Sub extends Super{
        static void display(){
            System.out.println("In sub class");
        }
      }
    
