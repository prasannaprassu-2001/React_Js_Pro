//print prime numbers 
 public class primeNumbers {
    public static void main(String args[]){
        int i;
        int j;
        for(i=1;i<=20;i++){
            int count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count ++;
            }
        }
         if (count == 2){
            System.out.println(i);
        
         }   
                
          
        }
    }
} 

//given no. is prime or not

public class primeNumbers{
    public static void main(String args[]){
        int i,m=0,flag=0;
        int j=5;
        m=j/2;
        if(j==0||j==1){
            System.out.println(j+"Not Prime no.");
        }else{
            for(i=2;i<=m;i++){
                if(j%i==0){
                    System.out.println(j+"Not Prime no.");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(j+"Prime no.");
            }
        }
    }
}
