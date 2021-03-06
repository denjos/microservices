package pe.com.denjos.Bean;

import java.util.ArrayList;
import java.util.List;



public class Hotel {
	
	private String id;
	
	private String name;
	
	private int pricePerNight;
	private Address address;
	private List<Review> reviews;
	
	protected Hotel() {this.reviews=new ArrayList<>();}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Hotel(String name, int pricePerNight, Address address, List<Review> reviews) {
		super();
		this.name = name;
		this.pricePerNight = pricePerNight;
		this.address = address;
		this.reviews = reviews;
	}

	
	
}
