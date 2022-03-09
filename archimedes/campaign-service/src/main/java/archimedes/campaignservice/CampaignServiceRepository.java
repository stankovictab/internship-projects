package archimedes.campaignservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignServiceRepository extends JpaRepository<Campaign, Long> {
	// TODO: ?
}
