package SearchExample;
import java.util.Arrays;

public class CharacterPosition {

		private static String data[] = {"Kashish", "Saksham" ,"Jasjeet" , "Nikhil" , "Ujjwal", "Pratik" , "Yug" , "Harshit" , "Deepesh" , "Ashi"}; 

		public static int iterativeSearch (String d[], String g) { 
		int ndx = 0; 
		    while (ndx < d. length && d[ndx] != g) ndx++;
		    if (ndx >=d. length) return -1; 
		    if (g == d[ndx]) return ndx;
		    else return -1; 
		}
		public static void main (String [] args) { 
		    String goal = "Jasjeet";
		    int result = iterativeSearch(data, goal); 
		    if (result < 0) 
		    System.out.println("The search could not find: " + goal);
		  else 
		    System.out.println("The goal of " + goal + " was found at index: " + result);
		}
	}
