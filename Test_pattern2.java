public class Test_pattern2 {
    public static void main(String[] args) {
        int n = 5; // Example value for n, you can change it as needed
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
