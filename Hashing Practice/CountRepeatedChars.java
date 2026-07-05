public class CountRepeatedChars {
    public static void main(String[] args) {
        String s="mahendranaidu";
        char c = 'n';
        int count = 0;

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}
