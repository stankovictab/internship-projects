package archimedes.campaignservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Campaign {
    @Id
    private Long id;

    private String campaignName;
}
