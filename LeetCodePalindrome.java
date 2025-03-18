
    import java.util.Scanner;
public class LeetCodePalindrome {
        public boolean isPalindrome(int x) {
            if(x<0)
            return false;
            int Original =x;
            int result = 0;
            while(x>0){
                int digit = x%10;
                if(result >Integer.MAX_VALUE/10)
                return false;
                result  = result *10+digit;
                x/=10;
            }
            return result==Original;
        }
        public static void main(String[] args) {
            LeetCodePalindrome m = new LeetCodePalindrome();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number:");
            int x =in.nextInt();
            System.out.println(m.isPalindrome(x));
        }
    }
