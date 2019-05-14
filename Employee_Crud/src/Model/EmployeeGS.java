package Model;

public class EmployeeGS {
	private int id;
	private String name;
	private int salary;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public EmployeeGS(int id,String name,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "id=" +id + " name=" + name + " salary=" + salary + "\n";
	}
	
	
}
