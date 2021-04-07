import java.util.Calendar;
public class Product {
	private String productName;
	private Calendar saleDate;
	private double price;
	
	Product(String sName,Calendar sDate,double price){
		this.productName=sName;
		this.saleDate=sDate;
		this.price=price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Calendar getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Calendar saleDate) {
		this.saleDate = saleDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", saleDate=" + saleDate + ", price=" + price + "]";
	}
	
}
