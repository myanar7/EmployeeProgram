import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee {
	
	private ArrayList<Project> projects= new ArrayList<Project>();
	private int numberOfDevelopers;
		
	public Developer(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence,double salary,Calendar hireDate,Department department,double pScore,ArrayList<Project> p){
		super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence,salary,hireDate,department,pScore);
		this.projects=p;
		this.numberOfDevelopers++;
	}
	
	public Developer(RegularEmployee re,ArrayList<Project> p){
		super(re.getId(),re.getFirstName(),re.getLastName(),re.getGender(),re.getBirthDate(),re.getMaritalStatus(),re.getHasDriverLicense(),re.getSalary(),re.getHireDate(),re.getDepartment(),re.getPerformanceScore());
		this.projects=p;
	}	
	public boolean addSale(Project p) {
		return this.projects.add(p);
	}
	public boolean removeSale(Project p) {
		return this.projects.remove(p);
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}

	public void setNumberOfDevelopers(int numberOfSalesEmployees) {
		this.numberOfDevelopers = numberOfSalesEmployees;
	}

	@Override
	public String toString() {
		return "Developer [projects=" + projects + ", numberOfDevelopers=" + numberOfDevelopers
				+ ", getPerformanceScore()=" + getPerformanceScore() + ", getBonus()=" + getBonus() + ", getSalary()="
				+ getSalary() + ", getHireDate()=" + getHireDate() + ", getNumberOfEmployees()="
				+ getNumberOfEmployees() + ", getDepartment()=" + getDepartment() + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getBirthDate()="
				+ getBirthDate() + ", getGender()=" + getGender() + ", getMaritalStatus()=" + getMaritalStatus()
				+ ", getHasDriverLicense()=" + getHasDriverLicense() + "]";
	}
	
}
