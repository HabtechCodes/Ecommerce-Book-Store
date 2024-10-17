package com.hosptal.Healthcare.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {

    @Id
    private int id;
    private String username;
    private String password;
    private String appointmentDetails;
    private int age;
    private String gender;



}
