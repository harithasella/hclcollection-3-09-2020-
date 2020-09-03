import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;
 
public class Demo
 {
         private static int cDublicates(ArrayList list)
       {
              List<String> distinctList = (List<String>)list.stream().distinct().collect(Collectors.toList());
              int dublicates = list.size()-distinctList.size();
              return dublicates;
       }
      public static void main(String [ ] args)
      {
 
            ArrayList<String> list = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for(int i=0; i<n+1; i++)
            {
               list.add(scan.nextLine());
            }
           int countDublicates = cDublicates(list);
           System.out.println(countDublicates);
       }
} 
