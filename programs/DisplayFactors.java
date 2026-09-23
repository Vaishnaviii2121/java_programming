import java.util.Scanner;

class Factors 
{
    public void display(int iNo)
    {
        for(int i = 1; i<= iNo ; i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}

public class DisplayFactors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        Factors fobj = new Factors();

        fobj.display(iValue);

        sc.close();
    }
}
