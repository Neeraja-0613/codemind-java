import java.util.Scanner;
class stringExample {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i].charAt(0) + "-->" + (int)arr[i].charAt(0));
        }
    }
}
