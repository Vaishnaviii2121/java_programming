class Marvellous
{
    public void display()
    {
        int iValue = 5;

        for(int i = iValue; i >= 1 ; i--)
        {
            System.out.print(i +" ");
        }
    }
}

public class Pattern5 
{
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();

        mobj.display();
    }
}
