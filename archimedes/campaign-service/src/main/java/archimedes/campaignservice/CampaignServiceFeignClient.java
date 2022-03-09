package archimedes.campaignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// This Feign Client will be accessed by other microservices, 
// in order to communicate with this one

@FeignClient(value = "campaign-service")
public interface CampaignServiceFeignClient {

	@GetMapping(value = "/campaign")
	public String home();

	@PostMapping(value = "/create")
	public boolean create(@RequestBody String name);
}
