//Author ralstobj
public class Door {
	private String doorName;
	private String state;

	/**
	 * Constructor for a Door.
	 * 
	 * @param doorname
	 *            The name of the door.
	 * @param state
	 *            The state of the door (open or closed).
	 */
	public Door(String doorname, String state) {
		this.setDoorName(doorname);
		this.setState(state);
	}

	/**
	 * Method that opens the door.
	 */
	public void open() {
		this.setState("open");
	}

	/**
	 * Method that closes the door.
	 */
	public void close() {
		this.setState("close");
	}

	/**
	 * Method that returns the name of the door.
	 * 
	 * @return The doors name.
	 */
	public String getDoorName() {
		return doorName;
	}

	/**
	 * Method that sets the doors name.
	 * 
	 * @param doorName
	 *            The doors name.
	 */
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}

	/**
	 * Method that returns state of the door.
	 * 
	 * @return State of the door (open or closed).
	 */
	public String getState() {
		return state;
	}

	/**
	 * Method that sets the state of the door.
	 * 
	 * @param state
	 *            State of the door (open or closed).
	 */
	public void setState(String state) {
		if (state.equals("open") || state.equals("close")) {
			this.state = state;
		} else {
			this.state = "close";
		}
	}

}
