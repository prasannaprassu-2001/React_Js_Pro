public class Fibonacci {                     //one class created
    public static void main(String args[]){  //inside a class one method declared
        int a=0,b=1,c,n=20;                  //and i created variables with some values
    System.out.println(a+" "+b);
    
    for(int i=3;i<=n;i++){                   //then loop created, it will execute until condition becomes false
        c=a+b;                               //after adding a and b ,then c value is 1
        System.out.println(c);               //it will print c value 
        a=b;                                 //here b value assign to a
        b=c;                                 //and c value assign to b
    }
    
    }
}
