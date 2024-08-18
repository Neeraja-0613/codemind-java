import java.util.Scanner;
public class number
{
    public static void main(String[] args)
    {
        int n;
        Scanner read= new Scanner(System.in);
        n=read.nextInt();
        if(n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
