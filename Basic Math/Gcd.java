/*                                    LOGIC LENI LOGIC 😂😂
                            debhaki Arithmetic Error ochesindi 😂, Na code ki
                                 Compiler Uri Vesukuni chachipoddi 😂😂


public class Gcd {
    public static void main(String[] args) {
        int n1=9;
        int n2=12;
        int factor_1 = 0;
        int factor_2 = 0;
        for(int i=0 ; i<=n1 ; i++){
            if(n1%i==0){
                for(int j=1 ; j<=n2 ; j++){
                    if(n2%j==0){
                        factor_1 += i;
                        factor_2 += j;

                    }
                }
            }
        }
        if(factor_1 == factor_2){
            System.out.println("It is a GCD");
        }
    }
}
*/

public class Gcd {

    public static void main(String[] args) {
        int n1=9;
        int n2=12;

        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2 = n2%n1;
            }
            
        }
        if(n1==0){
                System.out.println(n2 + " is gcd");
            }else{
                System.out.println(n1+" is gcd");
            }
    }
}