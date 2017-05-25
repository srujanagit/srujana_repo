package db.dao.imp;

public class McdMenu {
	private int no;
	private String orderItem;
	private String price;
	private String category;
	
	public McdMenu()
	{
		
	}
	
	public McdMenu(int no,String orderItem,String price,String category)
	{
		this.no=no;
		this.orderItem=orderItem;
		this.price=price;
		this.category=category;
		
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "McdMenu [no=" + no + ", orderItem=" + orderItem + ", price=" + price + ", category=" + category + "]";
	}
	

}
