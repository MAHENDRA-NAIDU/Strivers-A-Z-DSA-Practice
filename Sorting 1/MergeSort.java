public class MergeSort {
    public static void mergesort(int[] a, int left , int right){
        if(left>=right){
            return;
        }

        int mid = (left+right)/2;
        mergesort(a,left,mid);
        mergesort(a,mid+1,right);
        merge(a,left,mid,right);
    }

    static void merge(int[] a, int left, int mid, int right){

        int temp[] = new int[right -left+1];
        int i= left;
        int j= mid+1;
        int k=0;

        while(i<=mid && j<=right){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }

        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=right){
            temp[k++] = a[j++];
        }

        k=0;
        for(i=left ; i<=right ; i++){
            a[i] = temp[k];
            k++;
        }

    }
    public static void main(String[] args) {
        int a[] = {38, 27, 43, 3, 9, 82, 10};
        mergesort(a, 0, a.length-1);

        for(int nums : a)
            System.out.print(nums+ " ");
        
    }
}
