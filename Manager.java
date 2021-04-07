import java.util.ArrayList;
import java.util.Calendar;
public class Manager extends Employee{
	private ArrayList<RegularEmployee> regularEmployees;
	private double bonusBudget;
	
	
	public Manager(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,Department department,double bonusBudget){
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence,salary,hireDate,department);
		this.bonusBudget=bonusBudget;
	}
	public Manager(Employee employee,double bonusBudget){
		super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),employee.getHasDriverLicense(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());
		this.bonusBudget=bonusBudget;
	}
	public void addEmployee(RegularEmployee e) {
		this.regularEmployees.add(e);
	}
	public void removeEmployee(RegularEmployee e) {
		this.regularEmployees.remove(e);
	}
	public void distributeBonusBudget() {
		double unit=0;
		for(RegularEmployee e: this.regularEmployees) { 
			unit=+e.getSalary()*e.getPerformanceScore();
		}
		unit=bonusBudget/unit;
		for(int i=0;i<regularEmployees.size();i++) {
			regularEmployees.get(i).setBonus(unit*regularEmployees.get(i).getSalary()*regularEmployees.get(i).getPerformanceScore());
		}
	}
	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}
	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}
	public double getBonusBudget() {
		return bonusBudget;
	}
	public void setBonusBudget(double bonusBudget) {
		this.bonusBudget = bonusBudget;
	}
	@Override
	public String toString() {
		return "Manager [regularEmployees=" + regularEmployees + ", bonusBudget=" + bonusBudget
				+ ", getRegularEmployees()=" + getRegularEmployees() + ", getBonusBudget()=" + getBonusBudget()
				+ ", getSalary()=" + getSalary() + ", getHireDate()=" + getHireDate() + ", getNumberOfEmployees()="
				+ getNumberOfEmployees() + ", getDepartment()=" + getDepartment() + ", toString()=" + super.toString()
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getBirthDate()=" + getBirthDate() + ", getGender()=" + getGender() + ", getMaritalStatus()="
				+ getMaritalStatus() + ", getHasDriverLicense()=" + getHasDriverLicense() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
