 public class EvenOdd {
    public static void main(String args[]){
        int i=10;
        if(i%10==0){
            System.out.println("even number");
        }else if(i%10!=0)
        {
            System.out.println("Odd number");
        }
    }
}
 
//using array even or odd
 public class EvenOdd{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,10,20,30,40};
        System.out.println("Odd Numbers");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
 }