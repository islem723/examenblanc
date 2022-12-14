package esprit.tn.gestion_departement.repositpry;



import esprit.tn.gestion_departement.Model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface sprintRepo  extends JpaRepository<Sprint,Integer> {
}




