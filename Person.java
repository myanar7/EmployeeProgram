import java.util.Calendar;
public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	private byte gender;
	private Calendar birthDate;
	private byte maritalStatus;
	private boolean hasDriverLicence;
	public Person(int id, String firstName,String lastName,String gender ,Calendar birthDate,String maritalStatus,String hasDriverLicence){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthDate=birthDate;
		if(gender.equalsIgnoreCase("man"))
			this.gender=2;
		else if(gender.equalsIgnoreCase("woman"))
			this.gender=1;
		if(maritalStatus.equalsIgnoreCase("married"))
			this.maritalStatus=2;
		else if(maritalStatus.equalsIgnoreCase("single"))
			this.maritalStatus=1;
		if(hasDriverLicence.equalsIgnoreCase("yes"))
			this.hasDriverLicence=true;
		else if(hasDriverLicence.equalsIgnoreCase("no"))
			this.hasDriverLicence=false;	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		if(this.gender==1)
			return "Woman";
		else if(this.gender==2)
			return "Man";
		else
			return "Invalid Gender";
	}
	public void setGender(String gender) {
		this.gender=(byte) ((gender.equalsIgnoreCase("woman"))? 1 : this.gender);
		this.gender=(byte) ((gender.equalsIgnoreCase("man"))? 2 : this.gender);//BU KISMI BIR SOR SIKINTI OLABILIR
	}
	public String getMaritalStatus() {
		if(this.maritalStatus==1)
			return "Single";
		else if(this.maritalStatus==2)
			return "Married";
		else
			return "Invalid Marital Status";
	}
	public void setMaritalStatus(String status) {
		this.maritalStatus=(byte) ((status.equalsIgnoreCase("single"))? 1 : this.maritalStatus);
		this.maritalStatus=(byte) ((status.equalsIgnoreCase("married"))? 2 : this.maritalStatus);//BU KISMI BIR SOR SIKINTI OLABILIR

	}
	public String getHasDriverLicense() {
		if(this.hasDriverLicence)
			return "Yes";
		else
			return "No";
	}
	public void setHasDriverLicence(String info) {
		this.hasDriverLicence=(info.equalsIgnoreCase("yes"))?true:null;
		this.hasDriverLicence=(info.equalsIgnoreCase("no"))?false:null;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", maritalStatus=" + maritalStatus + ", hasDriverLicence="
				+ hasDriverLicence + "]";
	}
}

