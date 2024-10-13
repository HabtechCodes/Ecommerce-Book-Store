package com.hosptal.Healthcare.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Appointment {
    @Id
    private Integer appointmentId;
    private LocalDate appointmentDate;
    @ManyToOne
    private Patient patient;
}
