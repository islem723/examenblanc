package esprit.tn.gestion_departement.services;

import esprit.tn.gestion_departement.Model.Project;
import esprit.tn.gestion_departement.Model.Utilisateur;

import java.util.List;

public interface IuserService {
    public Utilisateur addUser(Utilisateur us);


    public void assignProjectToUser(int projectId, int userId);

}
