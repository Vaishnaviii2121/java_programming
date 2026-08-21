import java.io.*;
import java.util.*;

public class Solution9 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int line = 1;

        while(sc.hasNext())
        {
            String n = sc.nextLine();   
            System.out.println(line + " " + n); 
            line++;                   
        }
        
        sc.close();
    }
}
