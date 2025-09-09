package com.solutions.hydrogaurd.repository;

import com.solutions.hydrogaurd.model.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceItem, Long> {
    // Custom queries can be added here
}
