package esprit.tn.gestion_departement.repositpry;


import esprit.tn.gestion_departement.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface userRepo  extends JpaRepository<Utilisateur,Integer> {
}



