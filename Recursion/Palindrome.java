/*public class Palindrome {
    public static void main(String[] args) {
        String s = "NADAM";

        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("String is a Palindrome");
    }
}
*/


/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        String s = "MARKRAM";
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("String Is not A Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("String is a Palindrome");
    }
}