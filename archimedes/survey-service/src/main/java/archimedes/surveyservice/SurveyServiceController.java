package archimedes.surveyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyServiceController implements SurveyServiceFeignClient {

	@GetMapping(value = "/")
	@Override
	public String home() {
		return "Hello from survey-service's controller!";
	}
}
