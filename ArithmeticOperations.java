class Operations 
{
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void subtract(int a,int b)
    {
        System.out.println(a-b);
    }
    static void multiply(int a,int b)
    {
        System.out.println(a*b);
    }
    static void div(int a,int b)
    {
        System.out.println(a/b);
    }   
}
class arithmeticOperations
{
    public static void main(String[] args)
    {
        Operations.add(10,20);
        Operations.subtract(10,2);
        Operations.multiply(10,3);
        Operations.div(10,2);
    }
}
