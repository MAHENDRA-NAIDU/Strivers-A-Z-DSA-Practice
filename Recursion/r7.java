/*public class r7 {
    static void reverse(int a[], int left , int right){
        if(left>=right){
            return;
        }
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

        reverse(a, left+1, right-1);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        reverse(a, 0, a.length-1);

        for(int i=0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }

    }
}

*/

/**
 * r7
 */
public class r7 {

    static void reverse(int a[], int l, int r){
        if(l>=r)
            return;

        int temp = a[l];
        a[l]=a[r];
        a[r]=temp;

        reverse(a, l+1, r-1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        reverse(a, 0, a.length-1);

        for(int i=0 ; i<a.length ; i++){
            System.out.println(a[i]); 
        }
    }
}