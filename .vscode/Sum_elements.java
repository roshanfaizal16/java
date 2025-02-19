public class Sum_elements {
    public static void main(String[] args) {
        int[] arr = {2,7,5,7};
        int n= 9;
        sum(arr, n);
    }
    static void sum(int[] arr,int n){
        for(int i = 0;i<arr.length;i++){
              for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(i+" "+j);
                }
              }
        }
    }
}
