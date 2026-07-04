public class FunctionalSum {
    static int Sum(int n, int sum){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1, sum+n);
    }
    public static void main(String[] args) {
        System.out.println(Sum(5, 0));
    }
}
