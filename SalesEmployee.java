import java.util.ArrayList;
import java.util.Calendar;

public class SalesEmployee extends RegularEmployee {
	
	private ArrayList<Product> sales= new ArrayList<Product>();
	private int numberOfSalesEmployees;
	
	public SalesEmployee(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,Department department,double pScore,ArrayList<Product> s){
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence,salary,hireDate,department,pScore);
		this.sales=s;
		this.numberOfSalesEmployees++;
	}
	public SalesEmployee(RegularEmployee re,ArrayList<Product> s){
		super(re.getId(),re.getFirstName(),re.getLastName(),re.getGender(),re.getBirthDate(),re.getMaritalStatus(),re.getHasDriverLicense(),re.getSalary(),re.getHireDate(),re.getDepartment(),re.getPerformanceScore());
		this.sales=s;
	}
	public boolean addSale(Product s) {
		return this.sales.add(s);
	}
	public boolean removeSale(Product s) {
		return this.sales.remove(s);
	}
	public ArrayList<Product> getSales() {
		return sales;
	}
	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}
	public int getNumberOfSalesEmployees() {
		return numberOfSalesEmployees;
	}
	public void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
		this.numberOfSalesEmployees = numberOfSalesEmployees;
	}
	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + ", numberOfSalesEmployees=" + numberOfSalesEmployees
				+ ", getPerformanceScore()=" + getPerformanceScore() + ", getBonus()=" + getBonus() + ", getSalary()="
				+ getSalary() + ", getHireDate()=" + getHireDate() + ", getNumberOfEmployees()="
				+ getNumberOfEmployees() + ", getDepartment()=" + getDepartment() + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getBirthDate()="
				+ getBirthDate() + ", getGender()=" + getGender() + ", getMaritalStatus()=" + getMaritalStatus()
				+ ", getHasDriverLicense()=" + getHasDriverLicense() + "]";
	}
}
