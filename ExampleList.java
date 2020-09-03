import java.util.ArrayList;
import java.util.Scanner;

public class ExampleList 
{
      public static void main(String args[])
     {
         ArrayList<Integer> l=new ArrayList<>();
         Scanner s  = new Scanner(System.in);
         int n = s.nextInt();
         for(int i=0; i<n; i++) 
         {
            l.add(s.nextInt());
         }
         int sum = 0;
         for (int i : l)
        {  
         sum += i;
        }
          float average = sum / l.size();
          System.out.println( sum);
           System.out.println(average);
     }
}


