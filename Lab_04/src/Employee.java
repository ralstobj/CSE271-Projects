
public class Employee extends Person {
	
	public double salary;
	public String employer;
	public String jobtitle;
	
	public Employee(Person p) {
		super(p);
		this.setEmployer("");
		this.setSalary(0);
		this.setJobtitle("");
	}
	public Employee(){
		super();
		this.setEmployer("");
		this.setSalary(0);
		this.setJobtitle("");
	}
	public Employee(String name, int age, double height, double weight, String gender, String hairColor,
			String eyeColor, double salary, String employer, String jobtitle){
		super(name,age,height,weight,gender,hairColor,eyeColor);
		this.setEmployer(employer);
		this.setSalary(salary);
		this.setJobtitle(jobtitle);
	}
	
	public Employee(Employee s){
		this(s.getName(),s.getAge(),s.getHeight(),s.getWeight(),
				s.getGender(),s.getHairColor(),s.getEyeColor(),s.salary,s.employer,s.jobtitle);
	}
	public Employee clone(Employee s){
		return new Employee(s);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0){
			this.salary = 0;
		}else{
			this.salary = salary;
		}
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public boolean equals(Object o){
		if(o instanceof Employee){
			Employee e = (Employee)o;
			return super.equals(e) && e.getEmployer().equals(this.getEmployer())
					&& e.getSalary()==this.getSalary() && e.getJobtitle().equals(this.jobtitle);
		}else{
			return false;
		}
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String toString(){
		String info =  super.toString() + 
				"Salary:     " + salary + "\n" + 
				"Employer:   " + employer + "\n" + 
				"Job Title:  " + jobtitle;
		return info; 
	}
}
