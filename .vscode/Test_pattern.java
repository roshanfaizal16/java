public class Test_pattern {
    public static void main(String[] args) {
        christmas(12);
    }
     static void christmas(int n){
        for(int i =1;i<=n-9;i++){
            for(int j = n-9;j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l= 4;l<=n-7;l++){
            for(int m = n-10;m>0;m--){
              System.out.print(" ");
            }
            for(int o=1;o<=(l*2-5);o++){
           System.out.print("*");
        }
        System.out.println();
    }
    for(int p = 6;p<=n-4;p++){
        for(int q = n-10;q>=0;q--){
            System.out.print(" ");
        }
        for(int r =1;r<=(p*2-9)-4;r++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int s= 1; s<= 3; s++) {
        for (int t = n -10; t > 0; t--) {
            System.out.print(" ");
        }
        System.out.println("+++");
    }

  
    }

}
