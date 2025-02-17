public class Zeroatlast {
        public static void main(String[] args) {
            int[] arr = {1,3,4,5,0,6,7,9,0,5,0,3};
            zeroAtLast(arr);
        }
        static void zeroAtLast(int[] arr){
            int n = arr.length;
            int[] temp = new int[n];
            int j =0;
            
            for(int i = 0;i<n;i++){
                if(arr[i]!=0){
                    temp[j++]= arr[i];
                }
            }
            while(j<n){
                temp[j++]=0;
            }
            for(int i = 0;i<n;i++){
             arr[i] = temp[i];
            }
               for(int k:temp){
                System.out.print(k+" ");
               } 
            }
        }

        
    
    

