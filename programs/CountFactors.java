import java.util.Scanner;

public class CountFactors 
{
    public static void main(String[] args) 
    {
        int iCount = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        for(int i = 1; i<= iValue ; i++)
        {
            if((iValue % i ) == 0)
            {
                iCount++;
            }
        }

        System.out.println("Count of Factors :" +iCount);

        sc.close();
    }    
}
