package com.solutions.hydrogaurd.service;

import com.solutions.hydrogaurd.model.OfficeInfo;
import com.solutions.hydrogaurd.repository.OfficeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OfficeInfoService {
    @Autowired
    private OfficeInfoRepository officeInfoRepository;

    public List<OfficeInfo> getAllOfficeInfo() {
        return officeInfoRepository.findAll();
    }

    public OfficeInfo updateOfficeInfo(Long id, OfficeInfo officeInfo) {
        OfficeInfo existing = officeInfoRepository.findById(id).orElseThrow();
        existing.setAddress(officeInfo.getAddress());
        existing.setPhone(officeInfo.getPhone());
        existing.setEmail(officeInfo.getEmail());
        return officeInfoRepository.save(existing);
    }
}
