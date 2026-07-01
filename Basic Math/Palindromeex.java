public class Palindromeex {
    public static void main(String[] args) {
        int rev=0;
        int n=121;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n=n/10;
        }
        if(temp == rev){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
