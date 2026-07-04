public class r5 {
    public static int SumOfN(int n){
        if(n==0)
            return 0;
        
        return n + SumOfN(n-1);// 5+4+3+2+1
 
    }
    public static void main(String[] args) {
        System.out.println(SumOfN(5));
    }
}
