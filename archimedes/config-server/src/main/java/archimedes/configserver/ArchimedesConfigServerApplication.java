package archimedes.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ArchimedesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchimedesConfigServerApplication.class, args);
	}

}
