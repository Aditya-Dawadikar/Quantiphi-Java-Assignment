import java.util.*;

class Question3{
    public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println("---------Handled using Std output---------");
		System.out.println(a);
		System.out.println();
		
		System.out.println("---------Handled using advanced forloop---------");
		for(Integer ele: a){
		    System.out.println(ele);
		}
		System.out.println();
		
		System.out.println("---------Handled using for loop---------");
		for(int i=0;i<a.size();i++){
		    System.out.println(a.get(i));
		}
		System.out.println();
		
		System.out.println("---------Handled using while loop---------");
		ListIterator<Integer> it = a.listIterator();
		while(it.hasNext()){
		    System.out.println(it.next());
		}
	}
}