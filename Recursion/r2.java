public class r2 {

    public static void MyRecursion(int count, int n){
        
        if(count >n){
            return;
        }else{
            System.out.println("Mahi");
        }
        
        MyRecursion(count+1,n);
    }
    public static void main(String[] args) {
        MyRecursion(1,5);
    }
} 