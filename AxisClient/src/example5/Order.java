package example5;

public class Order {

	private String customerName;
	private String shippingAddress;
	private String[] itemCodes;
	private int[] quantities;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getShippingAddress() {
		return shippingAddress;
	}
	
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String[] getItemCodes() {
		return itemCodes;
	}
	
	public void setItemCodes(String[] itemCodes) {
		this.itemCodes = itemCodes;
	}
	
	public int[] getQuantities() {
		return quantities;
	}
	
	public void setQuantities(int[] quantities) {
		this.quantities = quantities;
	}
}
