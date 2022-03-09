package archimedes.campaignservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Campaign {
	// TODO: Lombok nacin da se u konstruktoru automatski inkrementira id?
	@Id
	private int id;

	private final String campaignName;
}
