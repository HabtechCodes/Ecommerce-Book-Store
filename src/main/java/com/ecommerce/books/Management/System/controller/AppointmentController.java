package com.hosptal.Healthcare.Management.System.controller;

import com.hosptal.Healthcare.Management.System.model.Appointment;
import com.hosptal.Healthcare.Management.System.model.Patient;
import com.hosptal.Healthcare.Management.System.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://localhost:5500")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping("appointments")
    public Appointment getAppointmentByPatientId(@RequestBody Patient patient) {
        return appointmentService.getAppointmentByPatientId(patient,patient.getId());
    }

//    @PostMapping("appointment")
//    public Appointment addAppointment(@RequestBody Appointment appointment) {
//        return appointmentService.addAppointment(appointment);
//    }

}