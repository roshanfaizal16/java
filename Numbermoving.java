public class Numbermoving {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,0,6,7,9,0,5,0,3};
        zeroAtLast(arr);
    }
    static void zeroAtLast(int[] arr){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==0)
               arr[i]=arr.length-1;
               else 
               count++;
             
        }

    }
}
