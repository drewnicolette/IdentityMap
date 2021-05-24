package identityMap;

public class PersonTable {
	private int id;
    private String firstname;
    private String lastname;
    private String physical_address;
    private String city;
    private String state;
    private String zip;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhysical_address() {
		return physical_address;
	}
	public void setPhysical_address(String physical_address) {
		this.physical_address = physical_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "PersonTable [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", physical_address="
				+ physical_address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
