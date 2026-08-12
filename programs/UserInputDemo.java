import java.util.*;

public class UserInputDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();

        System.out.println("Name : "+name);

        sc.close();
    }
}
