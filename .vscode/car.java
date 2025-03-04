public class car {
    string_opration name;
    car(){
        name = "unknown";
        System.out.println(name);
    }
   public void  setname(){
        System.out.println("Name:   "+"BMW");
    }
    public static void main(string_opration[] args) {
        car m = new car();
        m.setname();
    }
}
