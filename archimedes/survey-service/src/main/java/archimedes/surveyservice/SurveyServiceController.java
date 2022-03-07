package archimedes.surveyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import archimedes.campaignservice.;
import archimedes.campaignservice.CampaignServiceFeignClient;

@RestController
public class SurveyServiceController implements SurveyServiceFeignClient {

	// @Autowired
	// private CampaignServiceFeignClient csfc;

	@GetMapping(value = "/")
	@Override
	public String home() {
		return "Hello from survey-service's controller!";
	}
}
