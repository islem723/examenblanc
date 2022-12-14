package esprit.tn.gestion_departement.services;

import esprit.tn.gestion_departement.Model.Project;

import java.util.List;

public interface IprojectService {
    public Project addproject(Project project);
    public List<Project> getProjectsByScrumMaster(String fName, String IName);

    public List<Project> getAllCurrentProject();

}
