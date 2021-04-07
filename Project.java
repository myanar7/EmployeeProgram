import java.util.Calendar;
public class Project {
	private String projectName;
	private Calendar startDate;
	private boolean state;
	
	public Project(String pName,Calendar startDate,String state){
		this.projectName=pName;
		this.startDate=startDate;
		if(state.equalsIgnoreCase("open"))
			this.state=true;
		else if(state.equalsIgnoreCase("kapalý"))
			this.state=false;
		else
			System.out.println("Invalid Input");
	}
	public void setState(String state) {
		if(state.equalsIgnoreCase("open"))
			this.state=true;
		else if(state.equalsIgnoreCase("kapalý"))
			this.state=false;
	}
	public String getState() {
		if(this.state)
			return "Open";
		else
			return "Close";
	}
	public void close() {
		setState("close");
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", startDate=" + startDate + ", state=" + state + "]";
	}
}
