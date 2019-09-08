
public class Person {
	private String name;
	private String email;
	private String password;
	private String country;
	private String state;
	private String phoneNum;
	
	
	public Person(String name, String email, String password, String country, String state, String phoneNum) {
		this.setName(name);
		this.setEmail(email);
		this.setPassword(password);
		this.setCountry(country);
		this.setState(state);
		this.setPhoneNum(phoneNum);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", password=" + password + ", country=" + country
				+ ", state=" + state + ", phoneNum=" + phoneNum + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
