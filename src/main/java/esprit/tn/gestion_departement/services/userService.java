package esprit.tn.gestion_departement.services;

import esprit.tn.gestion_departement.Model.Project;
import esprit.tn.gestion_departement.Model.Utilisateur;
import esprit.tn.gestion_departement.repositpry.projectRepo;
import esprit.tn.gestion_departement.repositpry.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService implements IuserService {
    @Autowired
    userRepo up;
    @Autowired
    projectRepo oo;

    @Override
    public Utilisateur addUser(Utilisateur us) {
        return up.save(us);
    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {
    Utilisateur u=  up.findById(userId).orElse(null);
       Project p = oo.findById(projectId).orElse(null);
        p.getUser().add(u);
       oo.save(p);
    }
}




