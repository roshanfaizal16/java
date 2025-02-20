public class Sum_diagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        sum(arr);

    }
    static void sum(int[][] arr){
         int n =arr.length;
         int m = arr[0].length;
         int sum = 0;
         int sum1 = 0;
         for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                sum+=arr[i][j];
            }
         }
         arr[n-1][m-1]=sum;
         for (int i = 0; i<=1; i++) {
            for (int j = i+1; j<=m-1; j++){
                sum1+=arr[i][j];
            }
         }
         arr[0][0] = sum1;
         for(int[] k:arr){
            for( int z:k){
                System.out.print(z+" ");
            }
            System.out.println();
         }
            }
        }

    
    

