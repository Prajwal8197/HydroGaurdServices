package com.solutions.hydrogaurd.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OfficeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String phone;
    private String email;
    // Getters and setters
}

