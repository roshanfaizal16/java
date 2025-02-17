
import java.util.Arrays;



public class Stringtochar {
    public static void main(String[] args) {
        String str1 = "9985557674674657547677774";
        String str2 = "3465467373476375767367347";
        strChar(str1, str2);
}
static void strChar(String str1,String str2){
    char[] c  = str1.toCharArray();
        char[] d = str2.toCharArray();
        System.out.println(" "+Arrays.toString(c));
        System.out.println(" "+Arrays.toString(d));
    }
}

