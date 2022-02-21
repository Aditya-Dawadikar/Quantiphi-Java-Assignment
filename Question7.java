import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Question7{
    public static void main(String[] args) {
	    String s = new String("hheleyu5ilooqqrqwfqb");
	    List<Character> subject = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
	    System.out.println(subject);
	
	
	    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	    
	    for(Character c: subject){
	        if(hm.get(c)!=null){
	            hm.put(c,(int)hm.get(c)+1);
	        }else{
	            hm.put(c,1);
	        }
	    }
	    
	   for(Character c: subject){
	       if(hm.get(c)==1){
	           System.out.println("First non repeating character: "+c);
	           break;
	       }
	   }
	}
}