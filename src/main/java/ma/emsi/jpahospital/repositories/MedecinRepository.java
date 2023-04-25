package ma.emsi.jpahospital.repositories;

import ma.emsi.jpahospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository <Medecin, Long> {
    Medecin findByNom(String nom);


}
