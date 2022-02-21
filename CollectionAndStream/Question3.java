import java.util.*;
import java.util.stream.Collectors;

public class Question3 {
	public static void main(String args[]) {
		ArrayList<String> arr= new ArrayList<String>();
		
		arr.add("  He barked orders at his daughters but they just stared back with amusement.    ");
		arr.add("               He looked behind the door and didn't like what he saw.   ");
		arr.add(" Nudist colonies shun fig-leaf couture.     ");
		arr.add("     When I was little I had a car door slammed shut on my hand and I still remember it quite vividly.  ");
		arr.add("  There's an art to getting your way, and spitting olive pits across the table isn't it.         ");
	
		List<String> res = arr.stream().map(e->e.trim()).collect(Collectors.toList());
		
		System.out.println(res);
	}
}
