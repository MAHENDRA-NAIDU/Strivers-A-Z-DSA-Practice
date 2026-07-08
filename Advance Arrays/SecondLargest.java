/*public class LargestElement {
    public static void main(String[] args) {
        int a[] = {4,2,8,5,3};

        for(int i=0 ; i<a.length-1 ; i++){
            int min=i ; 
            for(int j=i ; j<a.length ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
        }
        System.out.println(a[a.length-1]);
    }
}
*/

/**
 * LargestElement
 */
public class SecondLargest {

    public static void main(String[] args) {
        int a[] = {4,3,6,2,7,8,5};

        int largest =0;

        for(int i=0 ; i<a.length ; i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
        System.out.println("The largest element is : " + largest);
    }
}