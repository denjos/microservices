package pe.com.denjos.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pe.com.denjos.Bean.Hotel;
import pe.com.denjos.Client.HotelClient;

@Component
public class HotelServiceFallback implements HotelClient {

	@Override
	public List<Hotel> getReservations() {
		return new ArrayList<Hotel>();
	}

}
