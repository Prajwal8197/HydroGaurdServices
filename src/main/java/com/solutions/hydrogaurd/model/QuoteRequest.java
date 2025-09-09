package com.solutions.hydrogaurd.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class QuoteRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String customerEmail;
    private String details;
    private LocalDateTime submittedAt;
    // Getters and setters
}

