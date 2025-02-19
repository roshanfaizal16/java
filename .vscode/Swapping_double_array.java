public class Swapping_double_array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        swapping(arr);

    }
    static void swapping(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int row = 0;
        int col = 0;
        int prev = 0;
        int curr = 0;
        while(row<m&&col<n){
            if(row+2==m||col+2==n){
                break;
            }
            prev = arr[row+1][col];
            for(int i = row;i<m-1;i++){
                curr = arr[row][i];
                arr[row][i] =prev;
                prev = curr;
            }
            row++;
            for(int j =col;j<n-1;j++){
                curr = arr[j][row+1];
                arr[j][row+1]  = prev;
                prev = curr;
            }
            col++;
            for(int j = n-1;j<=0;j--){
                curr = arr[col+1][j];
                arr[col+1][j] = prev;
                prev = curr;
            }
            row--;
            for(int i = m-1;i<=0;i-- ){
                curr = arr[i][col+1];
                arr[i][col+1] = prev;
                prev = curr;
            }
            col--;
            
        }
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        }
    }
