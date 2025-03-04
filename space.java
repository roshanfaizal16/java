public class space {
    public static void main(String[] args) {
        String input = "          i love java    programming ";
        String output = reverseSentence(input);
        System.out.println(output);
    }

    public static String reverseSentence(String input) {
        String[] words = input.trim().split("\\s+");
         
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) { 
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}

