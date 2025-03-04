public class Inheritence {
    private int a=878;
    private int b = 435;
    public int geta(){
        return a;
    }
    public int getb(){
        return b;
    }

    public static void main(string_opration[] args) {
     sum obj = new sum();
     obj.display();
    }
}
class sum extends Inheritence{
    void display(){
    int c = geta()+getb();
    System.out.println(c);

}
}
