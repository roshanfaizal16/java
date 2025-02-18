public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n;
        subArray(arr, 3);
    }
    static void subArray(int[] arr,int n){
        int l = arr.length;
        for (int i = 0;i<l;i++){
            if(arr[i]==n){
                for(int j =n-1;j>=0;j--){
                    System.out.print(arr[j]);
                }
            }
            else{
            for(int k=l-1;k>n+1;k--)
            {
                System.out.print(arr[k]);
            }
        }
        }
    }
}
