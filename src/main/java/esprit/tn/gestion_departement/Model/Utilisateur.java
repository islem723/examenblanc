package esprit.tn.gestion_departement.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utilisateur {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

       private  String email;
        private  String pwd ;
        private String fName;
    private String IName;
    @Enumerated(EnumType.STRING)
    private role Role;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Project> projets;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Project> projects;


    }
