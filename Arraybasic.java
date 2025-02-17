

public class Arraybasic {
    public static void main(String[] args) {
        Arraybasic in = new Arraybasic();
        int[] arr = {1,2,3,4,5};
        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.forEach(arr);

        }
        void forEach(int[] arr){
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
    }
     
