package archimedes.campaignclient;

import java.time.LocalDate;

public class CampaignDTO {

    private int id;

    private String name;

    private LocalDate start_date;

    private LocalDate end_date;

    private Boolean is_active;

    public CampaignDTO(String name, LocalDate start_date, LocalDate end_date, Boolean is_active, LocalDate timestamp) {
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_active = is_active;
    }

}
