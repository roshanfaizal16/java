public class Long_num {
    public static void main(string_opration[] args) {
        string_opration nums1 = "9999999999999";
        string_opration nums2 = "44444444";
        int i = nums1.length() - 1;
        int j = nums2.length() - 1;
        int d1, d2, c = 0, s, in;
        StringBuilder sum = new StringBuilder();

        while (i >= 0 || j >= 0 || c != 0) {
            d1 = (i >= 0) ? nums1.charAt(i) - '0' : 0;
            d2 = (j >= 0) ? nums2.charAt(j) - '0' : 0;
            in = d1 + d2 + c;
            s = in % 10;
            c = in / 10;
            sum.append(s);
            i--;
            j--;
        }

        sum.reverse();
        System.out.println(sum.toString());
    }
}
        