/*public class r4 {

    public static void main(String[] args) {
        int n=5;
        int sum =0;
        for(int i=1 ; i<=n ; i++){
            sum += i;

        }
        System.out.println(sum);
    }
}*/

public class r4{
    public static void NtoOne(int count){
        if(count==0){
            return;
        }
        else{
            System.out.println(count);
        }
        NtoOne(count-1);
    }
    public static void main(String[] args) {
        NtoOne(5);
    }
}