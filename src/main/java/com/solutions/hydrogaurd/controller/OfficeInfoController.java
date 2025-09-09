package com.solutions.hydrogaurd.controller;

import com.solutions.hydrogaurd.model.OfficeInfo;
import com.solutions.hydrogaurd.service.OfficeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/office")
public class OfficeInfoController {
    @Autowired
    private OfficeInfoService officeInfoService;

    @GetMapping
    public List<OfficeInfo> getAllOfficeInfo() {
        return officeInfoService.getAllOfficeInfo();
    }

    @PutMapping("/{id}")
    public OfficeInfo updateOfficeInfo(@PathVariable Long id, @RequestBody OfficeInfo officeInfo) {
        // TODO: Add admin authentication check
        return officeInfoService.updateOfficeInfo(id, officeInfo);
    }
}
