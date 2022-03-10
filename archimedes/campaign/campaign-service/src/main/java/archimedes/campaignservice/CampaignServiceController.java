package archimedes.campaignservice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import archimedes.campaignclient.CampaignDTO;
import archimedes.campaignclient.CampaignServiceFeignClient;

@RestController
// @RequiredArgsConstructor
public class CampaignServiceController implements CampaignServiceFeignClient {

	// private final SurveyServiceFeignClient ssfc;
	// TODO: Za ovo nam treba pom.xml promena, ali ne moze two-way (???)

	@Autowired
	CampaignServiceRepository repo;

	// private final CampaignMapper mapper;

	@Autowired
	CampaignMapper mapper;

	@GetMapping(value = "/campaign")
	@Override
	public String home() {
		System.out.println("Executed FeignClient!");
		return "Hello from campaign-service's controller!!!";
	}

	@PostMapping(value = "/create")
	@Override
	public String create(@RequestBody String name) {
		// TODO: Remove hardcoded values
		Campaign c = new Campaign(name, LocalDate.now(), LocalDate.now().plusDays(1), true, LocalDate.now());
		repo.save(c);
		return "Campaign created successfully!";
	}

	@GetMapping(value = "/getOne/{id}")
	@Override
	public CampaignDTO getOne(@PathVariable int id) {
		return mapper.mapToDto(repo.findById(id).get());
	}

	@GetMapping(value = "/getAll")
	@Override
	public List<CampaignDTO> getAll() {
		return mapper.mapAllToDto(repo.findAll());
	}
}
