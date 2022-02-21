import java.util.*;

public class Question2 {
	public static void main(String args[]) {
		String s = new String("The elephant didn't want to talk about the person in the room");
		String[] tokens = s.split(" ",-1);
		SortedSet<String> ss = new TreeSet<String>(new Comparator<String>() {
	        @Override
	        public int compare(String o1, String o2) {
	            return o1.toLowerCase().compareTo(o2.toLowerCase());
	        }
	    });
		
		for(String str:tokens) {
			ss.add(str);
		}
		System.out.println(ss);
	}
}
