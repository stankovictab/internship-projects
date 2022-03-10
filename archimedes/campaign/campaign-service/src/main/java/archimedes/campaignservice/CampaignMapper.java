package archimedes.campaignservice;

import java.util.List;

import org.mapstruct.Mapper;

import archimedes.campaignclient.CampaignDTO;

@Mapper(componentModel = "spring")
public interface CampaignMapper {

	// @Mapping(target = "Campaign", source = "CampaignDTO")
	public Campaign mapToEntity(CampaignDTO dto);

	public CampaignDTO mapToDto(Campaign entity);

	public List<CampaignDTO> mapAllToDto(List<Campaign> list);
}
