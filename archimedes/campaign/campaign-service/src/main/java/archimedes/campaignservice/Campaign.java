package archimedes.campaignservice;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
// TODO: Think about renaming to CampaignEntity,
// and adding @Table(name="campaign")
public class Campaign {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
	@SequenceGenerator(name = "seq_gen", sequenceName = "campaign_id_seq", allocationSize = 1)
	private int id;

	private String title;

	private String description;

	private LocalDate startDate;

	private LocalDate endDate;

	private Boolean isActive;

	private LocalDate timestamp;
}
