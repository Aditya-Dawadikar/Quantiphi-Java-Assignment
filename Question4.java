import java.util.*

class Question4{
    public static void main(String[] args) {
		String s = new String("asvuwavieh3r29ydbf9gwfvgobffbaci2bbfoi2bfbfiqfbsbf");
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++){
		    if(hm.get(s.charAt(i))!=null){
		        hm.put(s.charAt(i),(int)hm.get(s.charAt(i))+1);
		    }else{
		        hm.put(s.charAt(i),1);
		    }
		}
		
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
		    HashMap.Entry record = (HashMap.Entry)it.next();
		    if((int)record.getValue()>1){
		        System.out.println(record.getKey()+" occured "+ record.getValue() +" times");
		    }
		}
	}
}