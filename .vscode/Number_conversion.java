public class Number_conversion {
    public static void main(String[] args) {
        calculate(33);
        System.out.println();
        calculate1();
        System.out.println();
        calculate2();
        
    }
    static void calculate(int n){
            int [] res = new int[50];
            int i = 0;
            while(n!=0){
                res[i] = n%8;
                n =n/8;
                i++;
            }
            for(int j = i-1;j>=0;j--){
                System.out.print(res[j]);
            }
         }
         static void calculate1(){
            int m = 33;
            int [] res1 = new int[50];
            int i = 0;
            while(m!=0){
                res1[i] = m%2;
                m =m/2;
                i++;
            }
            for(int j = i-1;j>=0;j--){
                System.out.print(res1[j]);
            }
         }
         static void calculate2(){
            int p = 40;
            int [] res2 = new int[50];
            int i = 0;
            while(p!=0){
                res2[i] = p%16;
                p =p/16;
                i++;
            }
            for(int j = i-1;j>=0;j--){
                System.out.print(res2[j]);
            }
         }

         }


    

