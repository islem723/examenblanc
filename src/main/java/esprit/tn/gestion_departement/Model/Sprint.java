package esprit.tn.gestion_departement.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Sprint {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @ManyToOne
    Project projets;
}
