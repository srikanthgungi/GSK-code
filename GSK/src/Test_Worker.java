public class Test_Worker {
	public static void main(String[] args) {
		IProcessOrder processOrder = new ProcessOrdersImpl();
		Worker worker = new Worker(processOrder);
		Thread t = new Thread(worker);
		t.start();
	}
}
