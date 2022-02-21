import java.util.*;

public class Question1 {
	public static void main(String args[]) {
		List<String> argList = Arrays.asList(args);
		System.out.println("Argument List");
		System.out.println(argList);
		System.out.println();
		
		Collections.shuffle(argList);
		
		System.out.println("handled using std out");
		System.out.println(argList);
		System.out.println();
		
		System.out.println("handled using stream");
		argList.stream().forEach(e->System.out.print(e+" "));
		System.out.println();
		System.out.println();
		
		System.out.println("handled enhanced forloop");
		for(String s:argList) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println();
	}
}
