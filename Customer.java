import java.util.ArrayList;
import java.util.Calendar;
public class Customer extends Person {
	ArrayList<Product> products= new ArrayList<Product>();
	
	public Customer(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence,ArrayList<Product> products){
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence);
		this.products=products;
	}
	
	public Customer(Person person,ArrayList<Product> products) {
		super(person.getId(),person.getFirstName(),person.getLastName(),person.getGender(),person.getBirthDate(),person.getMaritalStatus(),person.getHasDriverLicense());
		this.products=products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [products=" + products + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getBirthDate()=" + getBirthDate() + ", getGender()="
				+ getGender() + ", getMaritalStatus()=" + getMaritalStatus() + ", getHasDriverLicense()="
				+ getHasDriverLicense() + "]";
	}
}
