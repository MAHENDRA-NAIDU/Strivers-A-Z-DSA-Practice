public class countOfRepeatedCharsUsingHashing {
    public static void main(String[] args) {
        String s = "abacabd";
        int hash[] = new int[26];
        char c = 'a';
        for(int i=0 ; i<s.length() ; i++){
            hash[s.charAt(i)-'a']++;
        }

        System.out.println(hash[c-'a']);

    }
    
}