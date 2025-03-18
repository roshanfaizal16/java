public class Frequency {
        public static void main(String[] args) {
            String s = "learn is to learn something";
            String[] words = s.toLowerCase().split("\\s+");
            boolean[] visited = new boolean[words.length];
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i]) {
                    int count = 1;
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            count++;
                            visited[j] = true;
                        }
                    }
                    System.out.println(words[i] + ": " + count);
                }
            }
        }
    }
    
