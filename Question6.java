import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Question6{
    public static void main(String[] args) {
	    Set<Character> store = new HashSet<Character>();
	    String s = new String("heleyu5ilooqqrqwfqb");
	    List<Character> subject = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
	
	    System.out.println(subject);
	    
	    for(Character c: subject){
	        if(store.contains(c)){
	            System.out.println("First repeaded Character: "+c);
	            return;
	        }else{
	            store.add(c);
	        }
	    }
	}
}