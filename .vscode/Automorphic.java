public class Automorphic{
    public static void main(String[] args) {
        int n = 76;
        int sq = n*n;
        String isn = Integer.toString(n);
        String issq = Integer.toString(sq);
        if(issq.endsWith(isn)){
            System.out.println("Automorphic ");
        }
        else{
            System.out.println("Not a automorphic");
        }
    }
}
