
class FetchData extends Thread{
	public void run() {
		try {
			System.out.println("Sleeping for 5000ms");
			Thread.sleep(5000);
            System.out.println("Fetch Data Thread running");
            System.out.println(Thread.currentThread().getName());  
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

class ProcessData implements Runnable{
	public void run() {
		try {
			System.out.println("Sleeping for 10000ms");
            Thread.sleep(10000);
            System.out.println("Process Data Thread running");
            System.out.println(Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}

public class Question3 {
	public static void main(String args[]) throws InterruptedException {
		FetchData fetchDataThread = new FetchData();
		Thread t = new Thread(new ProcessData(),"My Thread");
		
		System.out.println("invoking fetchdata thread");
		
		fetchDataThread.start();
		fetchDataThread.join();
		
		System.out.println("invoking processdata thread");
		
		t.start();
		t.join();
		
	}
}
