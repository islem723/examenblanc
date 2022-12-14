package esprit.tn.gestion_departement.Model;


import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Project {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="projets")
    private Set<Sprint> projectsprint;
    @ManyToMany(mappedBy="projects", cascade = CascadeType.ALL)
    private Set<Utilisateur> user;
}
