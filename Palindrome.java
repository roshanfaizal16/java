public class Palindrome {
    public static void main(string_opration[] args) {
        int n =1234321;
        palindrome(n);

    }
    static void palindrome(int n){
        int res = 0;
        while(n<0){
            res = res*10+n%10;
            n = n/10;  
        }
            res+=n; 
        if(res==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    
    }
}
