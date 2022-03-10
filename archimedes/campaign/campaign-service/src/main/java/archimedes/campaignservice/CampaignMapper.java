package archimedes.campaignservice;

import archimedes.campaignclient.CampaignDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CampaignMapper {

    public Campaign mapToEntity(CampaignDTO dto);
    public CampaignDTO mapToDto(Campaign entity);

}
