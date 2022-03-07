package archimedes.surveyservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "survey-service")
public interface SurveyServiceFeignClient {

	@GetMapping(value = "/")
	public String home();
}
