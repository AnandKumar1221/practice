import java.util.Scanner;
public class target {
    public static void main(String[] arg)
    {
        int arr[]=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        System.out.println("enter the element of array");
        for(int i=0;i<=n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("element of array is:");
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }   


        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int sum=arr[i]+arr[j];
                if(sum==23)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }

}
