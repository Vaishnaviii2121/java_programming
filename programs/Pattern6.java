// 2 4 6 8 10

class Marvellous
{
    public void display()
    {
        int iValue = 10;

        for(int i = 2; i <= iValue ; i = i + 2)
        {
            System.out.print(i +" ");
        }

    }
}

public class Pattern6 
{
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();

        mobj.display();
    }    
}
