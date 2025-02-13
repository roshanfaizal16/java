class Numberpattern{
    public static void main(String[] args) {
        int n = 5;
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
         for (int i = 1; i<=n; i++)
          {
            System.out.println(" ");
            for (int j = n-i; j >= 1; j--)
             {
                System.out.print(" ");
                
            }
            for(int k = 1;k<=i;k++)
            {
                System.out.print("1");
            }
             System.out.println();
         }
    } 
}