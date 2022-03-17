package archimedes.campaignservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import archimedes.campaignclient.CampaignDTO;
import archimedes.campaignclient.CampaignServiceFeignClient;
import archimedes.surveyclient.SurveyDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CampaignServiceController implements CampaignServiceFeignClient {

	private final CampaignServiceRepository repo;
	private final CampaignMapper mapper;

	// This overrides Actuator's info endpoint,
	// which isn't configured and returns an empty JSON
	@GetMapping(value = "/actuator/info")
	public String home() {
		return "Hello from campaign-service's controller!";
	}

	@PostMapping(value = "/create")
	public String create(@RequestBody SurveyDTO surveyDTO) {
		Campaign c = mapper.mapToEntity(surveyDTO);
		repo.save(c);
		return "Campaign created successfully!";
	}

	@GetMapping(value = "/getOne/{id}")
	public CampaignDTO getOne(@PathVariable("id") int id) {
		return mapper.mapToDto(repo.findById(id).get());
	}

	@GetMapping(value = "/getAll")
	public List<CampaignDTO> getAll() {
		return mapper.mapAllToDto(repo.findAll());
	}
}
