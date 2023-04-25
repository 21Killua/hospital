package ma.emsi.jpahospital.repositories;

import ma.emsi.jpahospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Long> {

    Patient findByNom(String name);



}
