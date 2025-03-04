public class Strongnumber_series {
    public static void main(String[] args) {
        digit();
    }
    static void digit(){
        for(int n=1;n<1000;n++){
        int fact = 0;
         int k = n;
        while(k>0){
        int res = k%10;
        int value = res;
          for (int i = res-1;i>0;i--){
            value=value*i;
          }
          k/=10; 
          fact+=value;
    } 
     if (fact==n){
        System.out.print(n+" " );
     }
    }
}
}





