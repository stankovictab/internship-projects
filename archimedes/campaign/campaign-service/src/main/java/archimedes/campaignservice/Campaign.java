package archimedes.campaignservice;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
// @NoArgsConstructor
@AllArgsConstructor
public class Campaign {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Auto incrementing the id
	// @GeneratedValue
	private int id;

	private String title;

	private String description;

	private LocalDate start_date;

	private LocalDate end_date;

	private Boolean is_active;

	private LocalDate timestamp;

	public Campaign() {
	}

	public Campaign(String title, String description, LocalDate start_date, LocalDate end_date, Boolean is_active,
			LocalDate timestamp) {
		this.title = title;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.is_active = is_active;
		this.timestamp = timestamp;
	}
}
