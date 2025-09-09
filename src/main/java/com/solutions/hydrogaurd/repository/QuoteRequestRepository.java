package com.solutions.hydrogaurd.repository;

import com.solutions.hydrogaurd.model.QuoteRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRequestRepository extends JpaRepository<QuoteRequest, Long> {
    // Custom queries can be added here
}

