package W12D5;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

      public class DataType {
                                  
        public static void main (String [] args) {
                      
        List<Double> d = new ArrayList<Double>();
        d.add(2.8);
        d.add(0.1);
        d.add(2.1);
        d.add(2.3);
        d.add(1.6);
        d.add(2.2);
        
        Collections.sort(d);                        
        System.out.println("The sorted list in ascending order is as follow :" + d);
        System.out.println("");
        Collections.reverse(d);        
        System.out.println("The sorted list in descending order is as follow :" + d);
        }
   }
