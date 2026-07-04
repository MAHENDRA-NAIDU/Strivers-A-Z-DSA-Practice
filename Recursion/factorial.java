public class factorial {
    static int xyz(int n){
        if(n==0){
            return 1;
        }
        return n*xyz(n-1);
    }
    public static void main(String[] args) {
       System.out.println(xyz(5));
    }
}
