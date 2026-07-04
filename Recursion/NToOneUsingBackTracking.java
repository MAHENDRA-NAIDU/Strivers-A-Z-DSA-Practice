public class NToOneUsingBackTracking {
    public static void backtrack(int i,int n){
        if(i>n)
            return;
        backtrack(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        backtrack(1, 5);
    }
}
