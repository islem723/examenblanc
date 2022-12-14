package esprit.tn.gestion_departement;

import esprit.tn.gestion_departement.Model.Project;
import esprit.tn.gestion_departement.Model.Utilisateur;
import esprit.tn.gestion_departement.configuration.PutMapping;
import esprit.tn.gestion_departement.repositpry.projectRepo;
import esprit.tn.gestion_departement.repositpry.sprintRepo;
import esprit.tn.gestion_departement.repositpry.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("rest")
public class RestController {


    @Autowired
    projectRepo projectRepository;

    @Autowired
    sprintRepo sprintRepository;

    @Autowired
    userRepo userRepository;


    //http://localhost:3000/rest/add-User
    @PostMapping("/add-User")
    public SecurityProperties.User addUser(@RequestBody Utilisateur entity) {
        return userRepository.save(entity);
    }


    //http://localhost:3000/rest/add-Project
    @PostMapping("/add-Project")
    public Project addProject(@RequestBody Project entity) {
        return projectRepository.save(entity);
    }


    @PutMapping("/{projectId}/{userId}")
    public void assignProjectToUser(@PathVariable Integer projectId, @PathVariable Integer userId) {

        Utilisateur user = userRepository.findById(userId).orElse(null);
        Project project = projectRepository.findById(projectId).orElse(null);

        user.setProjects((Set<Project>) project);
        userRepository.save(user);

    }



   /* @GetMapping()
    public List<Project> getAllCurrentProject() {
        List<Project> currentProjects =projectRepository.findAll();
        for( Project p : currentProjects){
            if (p.getSprints().getClass().)
        }
    }



*/


    @Scheduled(fixedRate = 30000)
    public List<Project> getNbrSprintByCurrentProject() {


        return null;
    }


}







