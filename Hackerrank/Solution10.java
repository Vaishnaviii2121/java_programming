import java.io.*;
import java.util.*;

public class Solution10
{
    static int breadth;
    static int height;
    
    static
    {
        Scanner sc = new Scanner(System.in);
        
        breadth = sc.nextInt();
        height = sc.nextInt();
    
    }

    public static void main(String[] args) 
    {
        if(breadth <= 0 || height <= 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            System.out.println(breadth*height);
        }
            
    }
}
