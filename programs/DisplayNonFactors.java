import java.util.Scanner;

class NonFactors
{
    public void display(int iNo)
    {
        for(int i = 1;i<=iNo; i++)
        {
            if((iNo %  i) != 0)
            {
                System.out.println(i);
            }
        }
    }
}

public class DisplayNonFactors 
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        NonFactors nf = new NonFactors();

        nf.display(iValue);

        sc.close();
    }
}
