import java.util.*;

public class Question4 {
	public static void main(String args[]) {
		ArrayList<String> employees = new ArrayList<String>();
		Set<String> products;
		HashMap<String,Integer> popularity = new HashMap<String,Integer>();
		Queue<String> waitingList;
		
//		populating the employees list
		employees.add("Gaurav");
		employees.add("Shubash");
		employees.add("Karan");
		employees.add("Aditya");
		employees.add("Gaurav");
		employees.add("Gaurav");
		employees.add("Aryan");
		employees.add("Aditya");
		employees.add("Saurabh");
		employees.add("Akash");
		
//		All employees
		System.out.println("All employees:");
		System.out.println(employees);
		System.out.println();
		
//		Product names
		products = new HashSet<String>(employees);
		System.out.println("Unique Product names:");
		System.out.println(products);
		System.out.println();
		
//		Most popular names
		for(String employee:employees) {
			if(popularity.get(employee)!=null) {
				popularity.put(employee,(int)popularity.get(employee)+1);
			}else {
				popularity.put(employee, 1);
			}
		}
		System.out.println("Name popularity:");
		System.out.println(popularity);
		System.out.println();
		
//		Employee waiting list
		waitingList = new LinkedList<String>(employees);
		System.out.println("Waiting list:");
		System.out.println(waitingList);
		System.out.println();
	}
}