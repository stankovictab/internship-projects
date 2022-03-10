package archimedes.surveyservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

// This Feign Client will be accessed by other microservices, 
// in order to communicate with this one

@FeignClient(value = "survey-service")
public interface SurveyServiceFeignClient {

	@PostMapping(value = "/survey")
	public String create(@PathVariable("title") String title, @PathVariable("description") String description);
}
