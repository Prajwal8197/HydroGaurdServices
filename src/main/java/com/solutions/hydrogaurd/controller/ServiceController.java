package com.solutions.hydrogaurd.controller;

import com.solutions.hydrogaurd.model.ServiceItem;
import com.solutions.hydrogaurd.service.ServiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @Autowired
    private ServiceItemService serviceItemService;

    @GetMapping
    public List<ServiceItem> getAllServices() {
        return serviceItemService.getAllServices();
    }

    @GetMapping("/{id}")
    public ServiceItem getServiceById(@PathVariable Long id) {
        return serviceItemService.getServiceById(id);
    }

    @PostMapping
    public ServiceItem createService(@RequestBody ServiceItem service) {
        // TODO: Add admin authentication check
        return serviceItemService.createService(service);
    }

    @PutMapping("/{id}")
    public ServiceItem updateService(@PathVariable Long id, @RequestBody ServiceItem service) {
        // TODO: Add admin authentication check
        return serviceItemService.updateService(id, service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        // TODO: Add admin authentication check
        serviceItemService.deleteService(id);
    }
}
