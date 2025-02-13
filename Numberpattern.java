class Numberpattern{
    public static void main(String[] args) {
        int n = 4;
         /*for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
                
            }
             System.out.println(" ");
         }for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                
            }
             System.out.println(" ");
         }for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
             System.out.println(" ");
         }*/
        /*  for (int i = 1; i<=n; i++)
          {
            System.out.println(" ");
            for (int j =n-i; j >= 1; j--)
             {
                System.out.print(" ");
                
            }
            for(int k = 1;k<=i;k++)
            {
                System.out.print("*  ");
            }
             System.out.println();
         }*/
        int q = 0;
         for (int i = 1; i<=n; i++)
         {
            System.out.println(" ");
           for (int j =n-i; j >= 1; j--)
            {
               System.out.print(" ");
               
           }
           for(int k = 1;k<=i+q;k++)
           {
            if(k==1||k==i+q||i ==n)
               System.out.print("*");
               else
               System.out.print("0");
           }
           for(int l =n-i;l>=1;l--)
           {
            System.out.print(" ");
           }
           q++;
        }
    } 
}