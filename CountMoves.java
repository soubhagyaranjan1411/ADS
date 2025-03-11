public class CountMoves {
    public static  int count(int n){
        if(n==1) return 0;
        return 2*count(n/2)+1;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total Moves"+count(n));
    }
}
