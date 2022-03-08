package archimedes.campaignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// This Feign Client will be accessed by other microservices, 
// in order to communicate with this one

@FeignClient(value = "campaign-service")
public interface CampaignServiceFeignClient {

	@GetMapping(value = "/campaign")
	public String home();
}
