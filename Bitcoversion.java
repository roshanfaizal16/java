import java.util.*;

public class Bitcoversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num = input.nextInt();
        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num /= 2;
        }
        int n = binary.length();
        for (int m = 0; m < 32 - n ; m++) {
            binary = 0 + binary;
        }
        System.out.println(binary);
        System.out.print("Enter i value : ");
        int i = input.nextInt();
        System.out.print("Enter j value : ");
        int j = input.nextInt();
        char[] str = binary.toCharArray();
        char val1 = str[i];
        char val2 = str[j];
        System.out.println(val1 + " : " + val2);
        String binarynth = "";
        for (int k = 0; k < binary.length(); k++) {
            if (i == k)
                binarynth += binary.charAt(j);
            else if (j == k)
                binarynth += binary.charAt(i);
            else
                binarynth += binary.charAt(k);

        }
        System.out.println(binarynth);

        long decimal = Long.parseLong(binarynth, 2);
        System.out.println(decimal);
        input.close();

    }
}