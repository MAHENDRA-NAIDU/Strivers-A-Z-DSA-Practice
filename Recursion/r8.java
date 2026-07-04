public class r8 {
    static boolean palindrome(String s, int l , int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }

        return palindrome(s, l+1, r-1);
        
    }
    public static void main(String[] args) {
        String s="MADAM";

        if(palindrome(s, 0, s.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
