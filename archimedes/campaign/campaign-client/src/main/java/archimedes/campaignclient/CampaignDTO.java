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

	private LocalDate start_date;

	private LocalDate end_date;

	private Boolean is_active;

	public CampaignDTO(String title, String description, LocalDate start_date, LocalDate end_date, Boolean is_active,
			LocalDate timestamp) {
		this.title = title;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.is_active = is_active;
	}

}
