class Ternary_operator {
    public static void main(String[] args) {
       int max;
       int a= 10;
       int b = 35;
       int c = 32;
       max  = (a>b &&a>c) ? a:(b>a&&b>c)?b:c;
       System.out.print("gretest of three numbers:"+max);
    }
}