class Method_triangle{
    int n;
    public void leftAngleTriangle(int n){
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightAngleTriangle(int n){
        for(int i = 0;i<=n;i++){
            for(int j =n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=i+1;k++){  
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Method_triangle obj = new Method_triangle();
        obj.leftAngleTriangle(4);
        obj.rightAngleTriangle(4);
    }
}