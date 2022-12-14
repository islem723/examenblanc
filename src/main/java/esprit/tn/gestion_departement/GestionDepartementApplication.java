package esprit.tn.gestion_departement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GestionDepartementApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDepartementApplication.class, args);
    }

}
