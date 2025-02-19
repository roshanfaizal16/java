public class Array_presence {
       public static void main(String[] args) {
           int[] a ={1,1,1,0,1,1,0,1,1,0,1,1};
           int[] b = {1,1,0,1};
           int count = 0;
           int value = 1;
           boolean x = false;
           while(value<=a.length-b.length){
            x=true;
           for (int i = count,j=0;j<b.length;i++,j++){
           if(a[i]!=b[j]){
                  x = false;
                  break; 
           }
           if(x){
            break;
           }
           
       }
       count++;
       value++;

    }
    if (x==true) {
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
}
}
