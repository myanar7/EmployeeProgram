import java.util.Calendar;

public class RegularEmployee extends Employee{
	private double performanceScore;
	private double bonus;
	
	public RegularEmployee(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,Department department,double performanceScore){
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence,salary,hireDate,department);
		this.performanceScore=performanceScore;
	}
	public RegularEmployee(Employee employee,double perfScore){
		super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),employee.getHasDriverLicense(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());
		this.performanceScore=perfScore;
	}
	public double getPerformanceScore() {
		return performanceScore;
	}
	public void setPerformanceScore(double performanceScore) {
		this.performanceScore = performanceScore;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "RegularEmployee [performanceScore=" + performanceScore + ", bonus=" + bonus + ", getSalary()="
				+ getSalary() + ", getHireDate()=" + getHireDate() + ", getNumberOfEmployees()="
				+ getNumberOfEmployees() + ", getDepartment()=" + getDepartment() + ", toString()=" + super.toString()
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getBirthDate()=" + getBirthDate() + ", getGender()=" + getGender() + ", getMaritalStatus()="
				+ getMaritalStatus() + ", getHasDriverLicense()=" + getHasDriverLicense() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
