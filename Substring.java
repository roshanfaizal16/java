public class Substring {
    public static void main(String[] args) {
        string();
        stringbuffer();
        stringbuilder();
    }
    static void string(){
        String sub = "prakash";
        String s = sub.substring(2,7);
        System.out.println("Substring is:"+s);
    
    }
    static void stringbuffer(){
        String sub1 = "prakash";
        StringBuffer pr = new StringBuffer(sub1);
        String m = pr.substring(2,5);
        System.out.println("Substring is:"+m);
    }
    static void stringbuilder(){
        String sub1 = "prakash malampatti";
        StringBuilder pr1 = new StringBuilder(sub1);
        String m = pr1.substring(2,12);
        System.out.println("Substring is:"+m);
    }
}
