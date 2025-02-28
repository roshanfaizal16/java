
import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = in.nextInt();
    if(digit(n)==n){
        System.out.println("Strong number");
    }
    else{
        System.out.println("Not a Strong number");
    }
    in.close();
    }
    static int digit(int n){
        int fact = 0;
        while(n>0){
        int res = n%10;
        n= n/10; 
        int value = res;
          for (int i = res-1;i>0;i--){
            value=value*i;
          }
          fact+=value;
    }
    return fact;
}
}
