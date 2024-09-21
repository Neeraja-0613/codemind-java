public class overloading {
    static void printArrayElements(int a[], int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(a[i]);
        }
    }
    static void printArrayElements(double a[], int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(a[i]);
        }
    }
    static void printArrayElements(String a[], int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(a[i]);
        }
    }
    static void printArrayElements(char a[], int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
        int a[]={10,20,30};
        double arr[]={12.2,13.3};
        String array[]={"hello", "all", "this", "is", "java"};
        char characterArray[]={'a', 'b', 'c'};
        printArrayElements(a,3);
        printArrayElements(arr,2);
        printArrayElements(array,5);
        printArrayElements(characterArray,3);
    }
}
