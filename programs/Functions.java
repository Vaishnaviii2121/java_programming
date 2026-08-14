import java.util.*;

public class Functions
{
    public static int Addition(int num1 , int num2)
    {
        return num1 + num2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int No1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int No2 = sc.nextInt();
        
        int iRet = 0;
        
        iRet = Addition(No1,No2);

        System.out.println("Addition is : "+iRet);

        sc.close();
    }
}
