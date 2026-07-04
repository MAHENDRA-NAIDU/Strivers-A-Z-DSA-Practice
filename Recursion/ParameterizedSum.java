public class ParameterizedSum {
    static void abc(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        
        abc(n-1,sum+n);
    }
    public static void main(String[] args) {
        abc(5, 0);
    }
}