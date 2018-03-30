package W12D5;
import java.util.*;

public class Arrange {

    public static void main (String[] args) {
    List <String> Name =  new ArrayList();
    Name.add("Insect");
    Name.add("Man");
    Name.add("Women");

    Collections.sort(Name);
    System.out.println(" The ascending sorted data is " + Name);
    
    Collections.reverse(Name);
    System.out.println(" The descending sorted data is " + Name);
    }
    }

