package esprit.tn.gestion_departement.repositpry;


import esprit.tn.gestion_departement.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface projectRepo  extends JpaRepository<Project,Integer> {
}





