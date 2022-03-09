package archimedes.campaignservice;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CampaignServiceController implements CampaignServiceFeignClient {

	// private final SurveyServiceFeignClient ssfc;
	// TODO: Za ovo nam treba pom.xml promena, ali ne moze two-way (???)

	@Autowired
	CampaignServiceRepository repo;

	@GetMapping(value = "/campaign")
	@Override
	public String home() {
		System.out.println("Executed FeignClient!");
		return "Hello from campaign-service's controller!!!";
	}

	@PostMapping(value = "/create")
	@Override
	public boolean create(@RequestBody String name) {
		Campaign c = new Campaign(name);
		repo.save(c);
		return true;
	}
}
