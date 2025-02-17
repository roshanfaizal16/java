public class Maxvaluearray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        firstMaxValue(num);
        secondMaxValue(num);

    }
    static void firstMaxValue(int[] num)
    {
        int max = num[0];
        for(int i = 0;i<num.length;i++)
        {
            if (num[i]>max)
            max = num[i];
        }
        System.out.println("first max value:"+max);
    }
    static void secondMaxValue(int[] num)
    {
        int max = num[0];
        for(int i = 0;i<num.length;i++)
        {
            if (num[i]>max)
            max = num[i];
        }
        int sec_max = num[0];
        for (int i = 1; i < num.length;i++){
            if(num[i]!=max&&num[i]>sec_max)
            sec_max = num[i];
        }
        System.out.println("second max value:"+sec_max);
    }
}
