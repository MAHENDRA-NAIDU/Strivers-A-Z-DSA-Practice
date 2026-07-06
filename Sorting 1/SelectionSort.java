/*public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {40,10,30,20,50};
        for( int i=0 ; i<a.length-1 ; i++){
            int min = i;
            for(int j=i ; j<a.length ; j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            
        }
 
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }

        
    }
}
*/


public class SelectionSort{
    public static void main(String[] args){
        int a[] = {40,10,20,30,50};
        for(int i=0 ; i<a.length ; i++){
            int min = i;
            for(int j=i ; j<a.length ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
       for(int i=0 ; i<a.length ; i++){
        System.out.println(a[i]);
       }

    }
}