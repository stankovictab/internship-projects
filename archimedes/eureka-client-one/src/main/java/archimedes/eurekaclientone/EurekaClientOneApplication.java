package archimedes.eurekaclientone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class EurekaClientOneApplication {

	@Autowired
	private FirstFeignClient ffc;

	@GetMapping(path = "/")
	public String getHomepage() {
		return ffc.getPosts();
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientOneApplication.class, args);
	}
}