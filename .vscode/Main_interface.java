public class Main_interface {
    public static void main(String[] args) {
        Fan m = new Fan();
      m.power();
      m.time();
      tv.power();
      light.power();
    }
}
 class Fan implements light{
    static void power(){
        System.out.println("Inside implemented class");
    }
   public void time(){
    int a = 10;
    System.out.println(a);
   }
}
interface light extends tv{
static void power(){
    System.out.println("Inside implemented class");
}
 default void watts(){

}
 default void time(){
    int a= 20;
 }

}
interface tv{
static void power(){
    System.out.println("Inside first inerface");
}
  void watts();
abstract void  time();
}