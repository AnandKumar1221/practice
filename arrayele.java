import java.util.Scanner;
public class arrayele 

{
   public static void main(String[] args) {
       
    
    System.out.println("Enter the size of the array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++)
    {
        System.out.println("Enter the element");
        arr[i] = sc.nextInt();
    }
    System.out.println("The elements in the array are:");
    for(int i=0; i<n; i++)
    {
        System.out.print(arr[i] + " ");
    }

   }
}
    

