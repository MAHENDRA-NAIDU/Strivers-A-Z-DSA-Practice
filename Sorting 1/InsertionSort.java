public class InsertionSort{
    public static void main(String[] args) {
        int a[] = {40,10,30,20,50};

        for(int i=1 ; i<a.length ; i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }

        }
        for(int i=0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }
    
    }
}