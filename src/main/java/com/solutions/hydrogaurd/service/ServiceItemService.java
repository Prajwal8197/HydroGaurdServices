package com.solutions.hydrogaurd.service;

import com.solutions.hydrogaurd.model.ServiceItem;
import com.solutions.hydrogaurd.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceItemService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceItem> getAllServices() {
        return serviceRepository.findAll();
    }

    public ServiceItem createService(ServiceItem service) {
        return serviceRepository.save(service);
    }

    public ServiceItem updateService(Long id, ServiceItem service) {
        ServiceItem existing = serviceRepository.findById(id).orElseThrow();
        existing.setName(service.getName());
        existing.setDescription(service.getDescription());
        existing.setPrice(service.getPrice());
        return serviceRepository.save(existing);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    public ServiceItem getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }
}
