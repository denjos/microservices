package pe.com.denjos.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.denjos.Bean.Hotel;
import pe.com.denjos.fallback.HotelServiceFallback;

@FeignClient(name = "${hotel.name}", url = "${hotel.url}",fallback=HotelServiceFallback.class)
public interface HotelClient {
	
	@GetMapping(value="/hotels/all",produces="application/json")
	List<Hotel> getReservations();

}
