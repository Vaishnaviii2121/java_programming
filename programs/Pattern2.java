import java.util.Scanner;

class PatternDisplay
{
    void Display(int iValue)
    {
        for(int i = 1;i<=iValue;i++)
        {
            System.out.print(i +" ");
        }
    }
}

public class Pattern2 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();

        PatternDisplay p = new PatternDisplay();

        p.Display(iNo);

        sobj.close();
    }
}
