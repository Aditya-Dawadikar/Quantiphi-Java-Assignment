
class Message{
	private String data;
	synchronized void setData(String data) {
		this.data = data;
	}
	synchronized String getData() {
		return this.data;
	}
}

class Writer extends Thread{
	Message m;
	
	Writer(Message msg){
		this.m = msg;
	}
	
	public void run() {
		System.out.println("Writing operation");
		m.setData("Hello world");
	}
}

class Reader extends Thread{
	Message m;
	
	Reader(Message msg){
		this.m = msg;
	}
	
	public void run() {
		System.out.println("Reading operation");
		System.out.println(m.getData());
	}
}

public class Question4 {
	public static void main(String args[]) {
		Message msg = new Message();
		
		Writer writerThread = new Writer(msg);
		Reader readerThread = new Reader(msg);
		
		System.out.println("Writer Thread Invoked");
		writerThread.start();
		System.out.println("Reader Thread Invoked");
		readerThread.start();
	}
}
