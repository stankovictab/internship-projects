package archimedes.campaignservice;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
// @NoArgsConstructor
@AllArgsConstructor
public class Campaign {
	@Id
	@GeneratedValue // Auto incrementing the id
	private int id;

	private String name;

	private LocalDate start_date;

	private LocalDate end_date;

	private Boolean is_active;

	private LocalDate timestamp;

	public Campaign() {
	}

	public Campaign(String name, LocalDate start_date, LocalDate end_date, Boolean is_active, LocalDate timestamp) {
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.is_active = is_active;
		this.timestamp = timestamp;
	}
}
