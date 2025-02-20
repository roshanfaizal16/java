public class car {
    String name;
    car(){
        name = "unknown";
        System.out.println(name);
    }
   public void  setname(){
        System.out.println("Name:   "+"BMW");
    }
    public static void main(String[] args) {
        car m = new car();
        m.setname();
    }
}
