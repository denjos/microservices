package pe.com.denjos.mongo.model;

public class Address {
	private String city;
	private String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

}
