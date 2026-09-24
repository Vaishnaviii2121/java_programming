import java.util.*;

class Marvellous
{
    public void display(int iValue)
    {
        int digit = 0;

        while(iValue != 0)
        {
            digit = iValue % 10;
            iValue = iValue / 10;
            System.out.println("Digits : "+digit);
        }
    }
}

public class DisplayDigits 
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNo = sc.nextInt();

        Marvellous mobj = new Marvellous();

        mobj.display(iNo);

        sc.close();
    }
}
