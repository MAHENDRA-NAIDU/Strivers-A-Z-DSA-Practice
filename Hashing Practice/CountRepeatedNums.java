/*public class CountRepeatedNums {
    public static void main(String[] args) {
        int n = 1;
        int[] a = {1, 2, 1, 3, 2,1};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
*/

/**
 * CountRepeatedNums
 */
public class CountRepeatedNums {

    static int hello(int n, int a[], int count){
        for(int i=0 ; i<a.length ; i++){
            if(a[i]==n)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]= {1,2,1,3,2};
        System.out.println(hello(3, a, 0));
    }
}