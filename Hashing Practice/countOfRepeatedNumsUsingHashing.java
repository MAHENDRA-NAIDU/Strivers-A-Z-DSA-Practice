/*public class countOfRepeatedNumsUsingHashing {
    public static void main(String[] args){
        int a[]={1,2,1,3,2};
        int hash[] = new int[10];
        int n=1; 

        for(int i=0 ; i<a.length ; i++){
            hash[a[i]]++;
        }
        
        System.out.println(hash[n]);
    }
}
*/

//                                Using Function

public class countOfRepeatedNumsUsingHashing{
    static int[] hello(int a[], int n){
        int hash[] = new int[10];

        for(int i=0 ; i<a.length ; i++){
            hash[a[i]]++;
        }
        return hash;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,3,2};
        int hash[] = hello(a,1);
        int n=1;
        System.out.println(hash[n]);
    }
}