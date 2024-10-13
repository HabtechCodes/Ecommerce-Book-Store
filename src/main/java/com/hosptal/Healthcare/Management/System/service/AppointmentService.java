package com.hosptal.Healthcare.Management.System.service;

import com.hosptal.Healthcare.Management.System.model.Appointment;
import com.hosptal.Healthcare.Management.System.model.Patient;
import com.hosptal.Healthcare.Management.System.repository.AppointmentRepository;
import com.hosptal.Healthcare.Management.System.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientService patientService;
    @Autowired
    private PatientRepository patientRepository;


    public Appointment getAppointmentByPatientId(Patient patient, int id) {

         Patient patient1 = patientService.getPatientById(id);

         try {
             if(patient1.getUsername().equalsIgnoreCase(patient.getUsername()) && patient1.getPassword().equalsIgnoreCase(patient.getPassword())) {
                 return getAppointment(id);
             }
         } catch (NullPointerException e) {
             throw new NullPointerException("INVALID USER");
         }
         return new Appointment();

    }

    private Appointment getAppointment(int appointmentId) {
        return appointmentRepository.findById(appointmentId).orElse(new Appointment());
    }

//    public Appointment addAppointment(Patient patient) {
//        return appointmentRepository.save();
//    }

}
