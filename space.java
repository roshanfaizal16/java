public class space {
    public static void main(String[] args) {
        String str = "          i love java    programming ";
        System.out.println(reverseSentence(str));
    }

    public static String reverseSentence(String str) {
        String[] arr= str.trim().split("\\s+");
         
        StringBuilder rs = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            rs.append(arr[i]);
            if (i > 0) { 
                rs.append(" ");
            }
        }
        
        return rs.toString();
    }
}

