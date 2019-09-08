
public class Student extends Person {
	private String major;
	private double GPA;
	private int year;
	
	public Student(){
		super();
		this.setMajor("");
		this.setGPA(0);
		this.setYear(0);
	}
	public Student(String name, int age, double height, double weight, String gender, String hairColor,
			String eyeColor,String major, double GPA, int year){
		super(name,age,height,weight,gender,hairColor,eyeColor);
		this.setMajor(major);
		this.setGPA(GPA);
		this.setYear(year);
	}
	public Student(Student s){
		this(s.getName(),s.getAge(),s.getHeight(),s.getWeight(),
				s.getGender(),s.getHairColor(),s.getEyeColor(),s.major,s.GPA,s.year);
	}
	public Student clone(Student s){
		return new Student(s);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<0){
			this.year = 0;
		}else{
			this.year = year;
		}
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	public boolean equals(Object o){
		if(o instanceof Student){
			Student s = (Student)o;
			return super.equals(s) && s.getMajor().equals(this.getMajor())
					&& s.getGPA()==this.getGPA();
		}else{
			return false;
		}
	}
	public String toString(){
		return super.toString() + 
				"Major:      " + major + "\n" + 
				"GPA:        " + GPA + "\n" + 
				"Year:       " + year;
	}
	
}
