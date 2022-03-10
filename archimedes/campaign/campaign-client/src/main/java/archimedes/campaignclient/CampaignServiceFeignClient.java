package archimedes.campaignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// This Feign Client will be accessed by other microservices, 
// in order to communicate with this one

@FeignClient(value = "campaign-service")
public interface CampaignServiceFeignClient {

	@GetMapping(value = "/campaign")
	String home();

	@PostMapping(value = "/create")
	String create(@RequestBody String name);

	@GetMapping(value = "/get/{id}")
	CampaignDTO getOne(@PathVariable int id);

	@GetMapping(value = "/getAll")
	List<CampaignDTO> getAll();
}
