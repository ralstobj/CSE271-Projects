
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private double height;
	private double weight;
	private String gender;
	private String hairColor;
	private String eyeColor;

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 * @param gender
	 * @param hairColor
	 * @param eyeColor
	 */
	public Person(String name, int age, double height, double weight, String gender, String hairColor,
			String eyeColor) {
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setGender(gender);
		this.setHairColor(hairColor);
		this.setEyeColor(eyeColor);
	}
	/**
	 * @param p
	 */
	public Person(Person p){
		this(p.name,p.age,p.height,p.weight,p.gender,p.hairColor,p.eyeColor);
		}
	/**
	 * 
	 */
	public Person(){
		this("",0,0,0,"","","");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Person clone(){
		return new Person(this);
	}
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	/**
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 */
	public void setGender(String gender) {
		if (gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		} else {
			this.gender = "male";
		}
	}

	/**
	 * @return
	 */
	public String getHairColor() {
		return hairColor;
	}

	/**
	 * @param hairColor
	 */
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	/**
	 * @return
	 */
	public String getEyeColor() {
		return eyeColor;
	}

	/**
	 * @param eyeColor
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o){
		if(o instanceof Person){
			Person p = (Person)o;
			return(p.name.equals(this.name)&&p.age == this.age&& p.height == this.height&& 
					p.weight == this.weight&&p.gender.equals(this.gender)&&
					p.hairColor.equals(this.hairColor)&&p.eyeColor.equals(this.eyeColor));
		}else{
			return false;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String info = "Name:       " + name + "\n" +
					  "Age:        " + age + "\n" +
					  "Height:     " + height + "\n" +
					  "Weight:     " + weight + "\n" +
					  "Gender:     " + gender + "\n" +
					  "Hair Color: " + hairColor + "\n" +
					  "Eye Color:  " + eyeColor + "\n";
					  ;
		return info;
	
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Person o) {
		return o.name.compareTo(this.name);
	}
}
