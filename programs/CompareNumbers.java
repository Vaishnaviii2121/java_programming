import java.util.*;

public class CompareNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        if(a == b)
        {
            System.out.println("Equal");
        }
        else if (a > b) 
        {
            System.out.println(a+" is Greater Number");    
        }
        else
        {
            System.out.println(b+" is Greater Number");
        }

        sc.close();
    }
}
