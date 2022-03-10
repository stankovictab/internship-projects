package archimedes.surveyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import archimedes.campaignclient.CampaignServiceFeignClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SurveyServiceController implements SurveyServiceFeignClient {

	private final CampaignServiceFeignClient csfc;

	@GetMapping(value = "/survey")
	@Override
	public String home() {
		String test = csfc.create("michael");
		System.out.println("Got back: " + test);
		return "Hello from survey-service's controller...";
	}
}
