import java.util.Scanner;

public class Array4 
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter array elements:");
        
        for(int i = 0; i < size ; i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter element to search : ");
        int x = sc.nextInt();
        
        for(int i = 0 ; i < numbers.length ; i++)
        {
            if(numbers[i]==x)
            {
                System.out.print("Element Found at index :  "+i);
            }
        }
        sc.close();
    }  
}
