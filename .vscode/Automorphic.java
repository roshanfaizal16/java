public class Automorphic{
    public static void main(String[] args) {
        for (int n = 0;n<10000;n++){
        int sq = n*n;
        String isn = Integer.toString(n);
        String issq = Integer.toString(sq);
        if(issq.endsWith(isn)){ 
            System.out.println(n);
        }
    }
}
}
