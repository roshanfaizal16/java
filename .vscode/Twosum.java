
import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,3};
        int target = 9;
        sum(arr, target);
    }
    static void sum(int[] arr,int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left] + arr[right] == target){
                System.out.println("["+left+" ,"+right+"]");
                break;
            }
            else if(arr[left] + arr[right] < target)
                left++;
            else
                right--;
        }
        // for(int j=i;j<3 ;j++){
        //     System.out.println(j);
        // }
    }
}
