import java.util.*;

public class Two_D_Array
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter the Number of columns : ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter Rows and Columns : ");

        for(int i=0; i<rows ; i++)
        {
            for(int j = 0; j<columns ; j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array : ");

        for(int i=0; i<rows ; i++)
        {
            for(int j=0 ; j<columns ; j++)
            {
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
