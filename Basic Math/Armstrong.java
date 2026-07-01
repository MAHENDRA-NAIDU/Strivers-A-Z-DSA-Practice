public class Armstrong {
    public static void main(String[] args) {
        int n = 133;
        int temp = n;
        int sum = 0;
        int digit = 0;
        while(temp!=0){
            digit++;
            temp = temp/10;
        }

        temp = n;

        while(temp!=0){
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem,digit); 
            temp = temp/10;
        }
        if(n == sum){
            System.out.println("It is Armstrong");
        }else{
            System.out.println("It is not Armstrong");
        }
    }

}
