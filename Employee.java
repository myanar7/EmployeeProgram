import java.util.Calendar;
public class Employee extends Person {
	private double salary;
	private Calendar hireDate;
	private Department department;
	private int numberOfEmployees;
	
	public Employee(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,Department department){
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence);
		this.salary=salary;
		this.hireDate=hireDate;
		this.department=department;
		this.numberOfEmployees++;
	}
	
	public Employee(Person person,double salary,Calendar hireDate,Department department){	
		super(person.getId(),person.getFirstName(),person.getLastName(),person.getGender(),person.getBirthDate(),person.getMaritalStatus(),person.getHasDriverLicense());
		this.salary=salary;
		this.hireDate=hireDate;
		this.department=department;	
	}
	public double raiseSalary(double percent) {
		return (percent<1 &&percent>0)?this.salary*percent:this.salary;
	}
	public double raiseSalary(int amount) {
		return this.salary+(double)amount;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Calendar getHireDate() {
		return hireDate;
	}

	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", department=" + department
				+ ", numberOfEmployees=" + numberOfEmployees + ", getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getBirthDate()=" + getBirthDate()
				+ ", getGender()=" + getGender() + ", getMaritalStatus()=" + getMaritalStatus()
				+ ", getHasDriverLicense()=" + getHasDriverLicense() + "]";
	}
}
