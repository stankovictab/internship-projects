package archimedes.campaignclient;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignDTO {

	private int id;

	private String title;

	private String description;

	private LocalDate startDate;

	private LocalDate endDate;

	private Boolean isActive;

	public CampaignDTO(String title, String description, LocalDate startDate, LocalDate endDate, Boolean isActive,
			LocalDate timestamp) {
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isActive = isActive;
	}

}
