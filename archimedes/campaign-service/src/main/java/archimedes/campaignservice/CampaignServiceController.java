package archimedes.campaignservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignServiceController implements CampaignServiceFeignClient {

	@GetMapping(value = "/")
	@Override
	public String home() {
		return "Hello from campaign-service's controller!";
	}
}
