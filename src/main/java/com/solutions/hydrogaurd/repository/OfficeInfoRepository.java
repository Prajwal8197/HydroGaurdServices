package com.solutions.hydrogaurd.repository;

import com.solutions.hydrogaurd.model.OfficeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeInfoRepository extends JpaRepository<OfficeInfo, Long> {
    // Custom queries can be added here
}

