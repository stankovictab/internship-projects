package archimedes.campaignservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CampaignServiceController implements CampaignServiceFeignClient {

	// private final SurveyServiceFeignClient ssfc;
	// TODO: Za ovo nam treba pom.xml promena, ali ne moze two-way (???)

	@GetMapping(value = "/campaign")
	@Override
	public String home() {
		System.out.println("Executed FeignClient!");
		return "Hello from campaign-service's controller!!!";
	}
}
