package ma.emsi.jpahospital.service;

import ma.emsi.jpahospital.entities.Consultation;
import ma.emsi.jpahospital.entities.Medecin;
import ma.emsi.jpahospital.entities.Patient;
import ma.emsi.jpahospital.entities.RendezVous;



public interface IHospitalService {

    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
