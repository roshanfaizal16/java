public class Arraysum {
     public static void main(string_opration[] args) {
         int[] a = {5,1,3,8,7};
         int[] b = {9,7,7,7,9,4};
         append(a, b);
     }
     static void append(int[] a,int[] b){
        int[] c = new int[b.length];
        int res =0;
        int quo = 0;
        for (int i = 0; i <a.length; i++) {
          if(quo==0){
            res  = a[i]+b[i];
          }
          else {
            res = a[i]+b[i]+quo;
          }  
             c[i]= res%10;
         quo = res/10;
         }

       
        for(int k:c){
            System.out.print(k+" ");
           }
        }
    }

