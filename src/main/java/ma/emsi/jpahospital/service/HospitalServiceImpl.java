package ma.emsi.jpahospital.service;

import jakarta.transaction.Transactional;
import ma.emsi.jpahospital.entities.Consultation;
import ma.emsi.jpahospital.entities.Medecin;
import ma.emsi.jpahospital.entities.Patient;
import ma.emsi.jpahospital.entities.RendezVous;
import ma.emsi.jpahospital.repositories.ConsultationRepository;
import ma.emsi.jpahospital.repositories.MedecinRepository;
import ma.emsi.jpahospital.repositories.PatientRepository;
import ma.emsi.jpahospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
