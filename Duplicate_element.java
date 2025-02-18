public class Duplicate_element{
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,9,1};
        for(int i = 0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j = 0;j<i;j++)
            if(arr[i]==arr[j]){
            isDuplicate = true;
            }
    if(!isDuplicate){
        System.out.print(arr[i]+" ");
    }
}
}
}