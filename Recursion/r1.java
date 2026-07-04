public class r1 {
    public static void xyz(int count ,int n){
        if(count>n)
            return;
        System.out.println(count);
        
        xyz(count+1,n);
    }
    public static void main(String[] args) {
        xyz(1,5);
    }
}