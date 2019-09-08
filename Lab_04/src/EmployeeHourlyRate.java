
public class EmployeeHourlyRate extends Employee {

	private double hours;
	private double hourlyRate;

	public EmployeeHourlyRate() {
		super();
		this.setHours(0);
		this.setHourlyRate(0);
		calculateSalary();
	}

	public EmployeeHourlyRate(String name, int age, double height, double weight, String gender, String hairColor,
			String eyeColor, double salary, String employer, String jobtitle, double hours, double hourlyRate) {
		super(name, age, height, weight, gender, hairColor, eyeColor, salary, employer, jobtitle);
		this.setHours(hours);
		this.setHourlyRate(hourlyRate);
		calculateSalary();
	}

	public boolean equals(Object o) {
		if (o instanceof EmployeeHourlyRate) {
			EmployeeHourlyRate h = (EmployeeHourlyRate) o;
			return super.equals(h) && h.getHours() == this.getHours();
		} else {
			return false;
		}
	}

	public EmployeeHourlyRate(EmployeeHourlyRate s) {
		this(s.getName(), s.getAge(), s.getHeight(), s.getWeight(), s.getGender(), s.getHairColor(), s.getEyeColor(),
				s.getSalary(), s.getEmployer(), s.getJobtitle(), s.hours, s.hourlyRate);
	}

	public EmployeeHourlyRate clone(EmployeeHourlyRate s) {
		return new EmployeeHourlyRate(s);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void calculateSalary() {
		salary = hourlyRate * hours;
		
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
		calculateSalary();
	}

	public String toString() {
		return super.toString() + "\n" + "Hours:      " + hours + "\n" +
										 "Hourly Rate:" + hourlyRate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
		calculateSalary();
	}
}
