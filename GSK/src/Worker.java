import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	private IProcessOrder processOrder;
	private Queue<Order> orders;

	/**
	 * Default constructor
	 * 
	 * @param processOrder
	 * @param order
	 */
	public Worker(IProcessOrder processOrder) {
		this.processOrder = processOrder;
	}

	@Override
	public void run() {
		orders = new ConcurrentLinkedQueue<Order>();
		for (int i = 1; i <= 10; i++) {
			Order order = new Order(i, Order.NEW_STATUS);
			orders.add(order);
		}

		processOrder.processOrders(orders);
	}

}
