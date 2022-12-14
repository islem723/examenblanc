package esprit.tn.gestion_departement.services;

import esprit.tn.gestion_departement.Model.Project;
import esprit.tn.gestion_departement.repositpry.projectRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class projectService implements IprojectService {
    @Autowired
   projectRepo ss;

    @Override
    public Project addproject(Project project) {
        return ss.save(project);
    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String IName) {
        return null;
    }



    @Override
    public List<Project> getAllCurrentProject() {
        return null;
    }
}
