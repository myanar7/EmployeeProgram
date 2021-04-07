import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		File file=new File("cse1142-spring2020-homework-1-input.txt");
		
		
		
		ArrayList<Person> person=new ArrayList<Person>();
		ArrayList<Employee> employee=new ArrayList<Employee>();
		ArrayList<RegularEmployee> regularEmployee=new ArrayList<RegularEmployee>();
		ArrayList<SalesEmployee> salesEmployee=new ArrayList<SalesEmployee>();
		ArrayList<Customer> customer=new ArrayList<Customer>();
		ArrayList<Manager> manager=new ArrayList<Manager>();
		ArrayList<Project> project=new ArrayList<Project>();
		ArrayList<Product> product=new ArrayList<Product>();
		ArrayList<Developer> developer=new ArrayList<Developer>();
		ArrayList<Department> department=new ArrayList<Department>();
		
		Scanner dc=new Scanner(file);
		
		String reader="";
		
		System.out.println(reader);
		String keyWord=dc.next();
		if(keyWord.equalsIgnoreCase("person"))
				person.add(new Person(Integer.parseInt(dc.next()),dc.next(),dc.next(),dc.next(),tt(dc.next()),dc.next(),dc.next()));
		else if(keyWord.equalsIgnoreCase("customer"))
				System.out.println();
		else if(keyWord.equalsIgnoreCase("manager"))
			System.out.println();
		else if(keyWord.equalsIgnoreCase("employee")) {
			int temp=0;
			for(int i=Integer.parseInt(dc.next());i!=person.get(temp).getId();temp++);
			employee.add(new Employee(person.get(temp),Double.parseDouble(dc.next()),tt(dc.next()),findDepartment(dc.next(),department)));
		}
		else if(keyWord.equalsIgnoreCase("regularemployee"))
			System.out.println();
		else if(keyWord.equalsIgnoreCase("salesemployee"))
			System.out.println();
		else if(keyWord.equalsIgnoreCase("project"))
			project.add(new Project(dc.next(),tt(dc.next()),dc.next()));
		else if(keyWord.equalsIgnoreCase("product"))
			product.add(new Product(dc.next(),tt(dc.next()),Double.parseDouble(dc.next())));
		else if(keyWord.equalsIgnoreCase("developer"))
			System.out.println();
		else if(keyWord.equalsIgnoreCase("department"))
			System.out.println();
	
	}
	public static	Department findDepartment(String s,ArrayList<Department> department) {
		for(Department dep:department) {
			String name=s;
			if(name.equalsIgnoreCase(s))
				return dep;
		}
		return null;
	}
public static Calendar tt(String s) throws ParseException {
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal  = Calendar.getInstance();
	cal.setTime(df.parse(s));
	return cal;
	}
}