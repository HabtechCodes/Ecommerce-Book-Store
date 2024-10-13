package com.hosptal.Healthcare.Management.System.repository;

import com.hosptal.Healthcare.Management.System.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
