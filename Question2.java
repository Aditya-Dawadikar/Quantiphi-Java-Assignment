import java.util.*;

class Question2{
    public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String data = new String("hello hello world world hello world hello");
		String[] tokens = data.split(" ", -1);
		
		// initializing the hashmap
		for(int i=0;i<tokens.length;i++){
		    if(hm.get(tokens[i])==null){
		        hm.put(tokens[i],1);
		    }else{
		        hm.put(tokens[i],(int)hm.get(tokens[i])+1);
		    }
		}
		
		System.out.println(hm);
	}
}