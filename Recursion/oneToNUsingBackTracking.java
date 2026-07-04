public class oneToNUsingBackTracking {
    public static void backTrack(int i){
        if(i==0)
            return;
        backTrack(i-1);
        System.out.println(i);
    }
public static void main(String[] args) {
    backTrack(3);
}
}
