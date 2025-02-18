public class Shift_elements{
    public static void main(String[] args) {
        int[] arr= {10,20,5,3,2};
        int n = 3;
        shift(arr, n);
    }
    static void shift(int[] arr,int n){
        int k=arr.length;
        int count = 1;
        while(count<=n){
            int temp = arr[k-1];
        for (int i =k-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        count++;}
        for(int z:arr){
            System.out.print(z+" ");
        }
    }
}