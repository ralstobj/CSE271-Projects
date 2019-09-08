//Author ralstobj and zhaog2
// Class that represents the information about a car.

public class Car {
	private String make;
	private String model;
	private int year;
	private String ownerName;
	private int fuelEfficency;
	public int fuel;
	
	/**Constructor for the car.
	 * @param make Make of the car.
	 * @param model Model of the car.
	 * @param year Year that the car was made.
	 * @param ownerName Name of the owner of the car.
	 * @param fuelEfficency Fuel efficency of the car in mpg.
	 * @param fuel Gallons of fuel in a car.
	 */
	public Car(String make, String model, int year, String ownerName, int fuelEfficency, int fuel){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setOwnerName(ownerName);
		this.setFuelEfficency(fuelEfficency);
		this.setFuel(fuel);
	}
	
	/**Default constructor for car.
	 * Creates a car with this information.
	 * Make: Ford
	 * Model: Mustang
	 * Year: 2013
	 * Owner: Mike
	 * Fuel Efficency: 16mpg
	 * Fuel: 10 gallons
	 */
	public Car(){
		this("Ford", "Mustang",2013,"Mike",16,10);
	}
	
	/**Constructor to make a new car using the data of another car.
	 * @param c Car that is being copied
	 */
	public Car(Car c){
		this(c.make,c.model,c.year,c.ownerName,c.fuelEfficency,c.fuel);
	}
	
	/**Method that clones the current car and returns it. 
	 */
	public Car clone(){
		return new Car(this);
	}
	
	/**Method that calculates fuel loss after a certain drive.
	 * @param distance Car drives this distance in miles.
	 */
	public void drive(int distance){
		this.setFuel(fuel - distance/fuelEfficency);
	}
	
	/**Method that returns amount of fuel in tank.
	 * @return Amount of fuel.
	 */
	public int getFuel() {
		return fuel;
	}
	/**Method that sets the amount of fuel in the tank.
	 * @param fuel- Amount of fuel.
	 */
	public void setFuel(int fuel) {
		if(fuel <0){
		this.fuel = 0;
		}else{
			this.fuel = fuel;
		}
	}
	/**Method that returns the make of the car.
	 * @return Make of car.
	 */
	public String getMake() {
		return make;
	}
	/**Method that sets the make of the car.
	 * @param make- Make of car.
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**Method that returns the model of the car.
	 * @return Model of the car.
	 */
	public String getModel() {
		return model;
	}
	/**Method that sets the model of the car.
	 * @param model - Model of the car.
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**Method that gets the year of the car.
	 * @return  Year of car.
	 */
	public int getYear() {
		return year;
	}
	/**Method that sets the year of the car.
	 * @param year - Year of car.
	 */
	public void setYear(int year) {
		if(year<1800){
			this.year = 1800;
		}else if(year>2018){
			this.year = 2018;
		}else{
		this.year = year;
		}
	}
	/**Method that gets the Owner Name of the car.
	 * @return Owner Name of car.
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**Method that sets the Owner Name of the car.
	 * @param ownerName - Owner Name of car.
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**Method that gets the Fuel Efficency of the car.
	 * @return Fuel Efficency of car.
	 */
	public int getFuelEfficency() {
		return fuelEfficency;
	}
	/**Method that sets the Fuel Efficency of the car.
	 * @param fuelEfficency - Fuel Efficency of car.
	 */
	public void setFuelEfficency(int fuelEfficency) {
		if(fuelEfficency <0){
			this.fuelEfficency = 0;
			}else{
				this.fuelEfficency = fuelEfficency;
			}
		this.fuelEfficency = fuelEfficency;
	}
	
	/**Method that compares to cars to see if they are the same.
	 * @param c
	 * @return true if the cars are exactly the same and false if not.
	 */
	public boolean equals(Car c){
		return (make.equals(c.make)&&
		model.equals(c.model)&&
		year==c.year&&
		ownerName.equals(c.ownerName)&&
		fuelEfficency == c.fuelEfficency&&
		fuel==c.fuel);
	}
	/**Method that returns car information
	 * @return information of the car
	 */
	@Override
	public String toString() {
		return "Make:           " + make + "\n"+
			   "Model:          " + model + "\n"+
			   "Year:           " + year + "\n"+
			   "Owner Name:     " + ownerName +"\n"+
			   "Fuel Efficency: " + fuelEfficency +" mpg"+ "\n"+
			   "Fuel:           " + fuel +" gallons" +"\n";
	}
	
	
	
}
