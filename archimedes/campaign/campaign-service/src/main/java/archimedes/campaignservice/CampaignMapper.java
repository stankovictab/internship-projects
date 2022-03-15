package archimedes.campaignservice;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import archimedes.campaignclient.CampaignDTO;
import archimedes.surveyclient.SurveyDTO;

@Mapper(componentModel = "spring")
public interface CampaignMapper {

	public Campaign mapToEntity(CampaignDTO dto);

	// TODO: Remove hardcoded values
	@Mapping(target = "startDate", expression = "java(java.time.LocalDate.now())")
	@Mapping(target = "endDate", expression = "java(java.time.LocalDate.now().plusDays(1))")
	@Mapping(target = "isActive", expression = "java(true)")
	@Mapping(target = "timestamp", expression = "java(java.time.LocalDate.now())")
	Campaign mapToEntity(SurveyDTO surveyDTO);

	CampaignDTO mapToDto(Campaign entity);

	List<CampaignDTO> mapAllToDto(List<Campaign> list);
}
