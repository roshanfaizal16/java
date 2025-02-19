public class Array_transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);
    }
    static void transpose(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int temp =arr[0][0];
                for(int i = 0;i<m;i++){
                    for(int j = i;j<n;j++){
                         temp  =arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i]  = temp;
                }
            }
            for(int[] k:arr){
                for(int z:k){
                    System.out.print(z+" ");
                }
                System.out.println();
            }
        }
    }