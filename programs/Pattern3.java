class Marvellous
{
    public void display()
    {
        int iValue = 5;

        for(int i = 1; i <= iValue ; i++)
        {
            System.out.print("*\t");
        }
    }
}

public class Pattern3 
{
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();

        mobj.display();
    }
}
