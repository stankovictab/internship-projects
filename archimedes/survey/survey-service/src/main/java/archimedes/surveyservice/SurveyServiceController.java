package archimedes.surveyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import archimedes.campaignclient.CampaignServiceFeignClient;
import archimedes.surveyclient.SurveyDTO;
import archimedes.surveyclient.SurveyServiceFeignClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SurveyServiceController implements SurveyServiceFeignClient {

	private final CampaignServiceFeignClient campaignServiceFeignClient;

	// This overrides Actuator's info endpoint,
	// which isn't configured and returns an empty JSON
	@GetMapping(value = "/actuator/info")
	@Override
	public String home() {
		return "Hello from survey-service's controller!";
	}

	@PostMapping(value = "/create/{title}/{description}")
	@Override
	public String create(@PathVariable("title") String title, @PathVariable("description") String description) {
		SurveyDTO surveyDTO = new SurveyDTO(title, description);
		String test = campaignServiceFeignClient.create(surveyDTO);
		return "Got back: " + test;
	}
}
