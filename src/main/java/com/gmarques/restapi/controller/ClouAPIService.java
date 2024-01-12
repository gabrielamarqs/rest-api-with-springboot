package com.gmarques.restapi.controller;

import com.gmarques.restapi.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class ClouAPIService {
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendor(String vendorID) {
        return new CloudVendor("C1", "AWS", "Seattle, WA", "1-800-555-1212");
    }
}
