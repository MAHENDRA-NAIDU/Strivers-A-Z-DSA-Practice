public class r3 {
    static void recursion(int count, int n){
        if(count >n)
            return;
        System.out.println(count);
        recursion(count+1,n);
    }
    public static void main(String[] args) {
        recursion(1,5);
    }
}