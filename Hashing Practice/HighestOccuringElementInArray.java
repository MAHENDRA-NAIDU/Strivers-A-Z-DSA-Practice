/**
 * HighestOccuringElementInArray
 */
public class HighestOccuringElementInArray {

    public static void main(String[] args) {
        int a[] = {1,2,1,3,1};
        int hash[] = new int[10];

        for(int i=0 ; i<a.length ; i++){
            hash[a[i]]++;
        }
        
        
        int maxFreq = 0;
        int element = -1;

        
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > maxFreq) {
                maxFreq = hash[i];
                element = i;
            }
        }

        System.out.println("Highest Occurring Element : " + element);
        System.out.println("Frequency : " + maxFreq);
    }
}