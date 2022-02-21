import java.util.*

class Question1{
    public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("aditya",1);
		hm.put("chandler",12);
		hm.put("geekgod",19);
		hm.put("bobafett",15);
		
		System.out.println("---------Handled using Std output---------");
		System.out.println(hm);
		System.out.println();
		
		System.out.println("---------Handled using advanced forloop---------");
	    for (HashMap.Entry<String, Integer> record :hm.entrySet()) {
            System.out.println(record.getKey() + ":"+ record.getValue());
        }
        System.out.println();
        
        System.out.println("---------Handled using while loop---------");
        Iterator  it = hm.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry record = (HashMap.Entry)it.next();
            System.out.println(record.getKey() + ":"+ record.getValue());
        }
	}
}