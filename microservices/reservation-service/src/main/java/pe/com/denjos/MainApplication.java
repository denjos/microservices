package pe.com.denjos;

import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
public class MainApplication 
{
	@Bean
	CommandLineRunner commandLineRunner (ReservationRepository reservationRepository)
	{
					
		return strings->{
			Stream.of("oscar","javier","herrera").forEach(n->reservationRepository.save(new Reservation(n)));
		};
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(MainApplication.class, args);
    }
}

@RestController
@RefreshScope
class MessageRestControoler{
	@Value("${message}")
	private String message;
	
	@RequestMapping("/message")
	String message()
	{
		return this.message;
	}
}


@RepositoryRestResource
interface ReservationRepository extends JpaRepository<Reservation,Long>
{
	@RestResource(path="by-name")
	Collection findByReservationName(@Param("rn") String rn);
}

@Entity
class Reservation{
	@Id @GeneratedValue
	private long id;
	private String reservationName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReservationName() {
		return reservationName;
	}
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}
	public Reservation(String reservationName) {
		super();
		this.reservationName = reservationName;
	}
	
	public Reservation() {
		
	}
	
}
