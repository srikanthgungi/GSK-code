import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ProcessOrdersImpl implements IProcessOrder {
	public ProcessOrdersImpl() {
		super();
	}

	@Override
	public void processOrders(Queue<Order> orders) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

		for (Order order : orders) {
			OrderTask task = new OrderTask(order);
			executor.submit(task);
		}
	}

	private class OrderTask extends Thread {
		public Order order;

		public OrderTask(Order order) {
			this.order = order;
		}

		public void run() {
			order.setOrderStatus(Order.FULFILLED_STATUS);
			System.out.println("Order Number: " + order.getOrderNumber());
			System.out.println("Order Status: " + order.getOrderStatus());
		}
	}

}
