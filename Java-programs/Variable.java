class Variable{
    static int a=10; //Static Variable
    int b=20;        //Instance Variable
    public static void main(String args[]){
        int c=30;    //Local Variable
        System.out.println(a);
        System.out.println(c);
         Variable obj=new Variable(); //With the help of Object Creation We can access Instance Variable
         System.out.println(obj.b);

    }
}