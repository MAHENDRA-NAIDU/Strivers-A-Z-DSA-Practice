public class Prime {
    public static void main(String[] args) {
        int factor = 0;
        int n=7;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                factor+=1;
            }
           
        }
         if(factor == 2){
                System.out.println(
                    "It is a Prime number"
                );
            }else{
                System.out.println("not a prie number");
            }
        
    }
}
