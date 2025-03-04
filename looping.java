

public class looping {
    public static void main(string_opration[] args) {
     int evennum = 0;  
     int oddnum = 0;
    int[] arr = {1,2,3,4,5,6};
    int n = arr.length;
    for(int i = 0;i<=n;i++)
    {
        if(arr[i]%2==0){
        System.out.println(arr[i]);
        evennum+=arr[i];
        }
        else{
        System.out.println(arr[i]);
        oddnum+=arr[i];
    }
}   
    }
}
