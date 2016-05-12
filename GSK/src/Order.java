public class Order {
	public static String NEW_STATUS = "NEW";
	public static String FULFILLED_STATUS = "FULFILLED";

	private int orderNumber;
	private String orderStatus;

	public Order(int orderNumber, String orderStatus) {
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		System.out.println("Order Number: " + orderNumber);
		System.out.println("Order Status: " + orderStatus);
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
